package co.mobiwise.rakimuzikleri.dao.impl;

import java.util.List;

import co.mobiwise.rakimuzikleri.dao.SongDao;
import co.mobiwise.rakimuzikleri.model.Service;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

public class SongDaoImpl implements SongDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	// for adding new songs.
	public boolean addSong(Service service) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(service);
		tx.commit();
		session.close();

		return false;
	}

	// get song by Id
	public Service getSongById(long id) throws Exception {
		session = sessionFactory.openSession();
		Service service = (Service) session.load(Service.class,
				new Long(id));
		int a = service.getSongViewCount();
		service.setSongViewCount(a+1);
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return service;
	}

	/*@Override
	public Service getSongViewCount(long id) throws Exception{
		session = sessionFactory.openSession();
		Service service = (Service) session.load(Service.class, new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return service;
	}
*/
	// get Most View songs List
	public List<Service> getMostViewList() throws Exception{
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Criteria crit = session.createCriteria(Service.class);

		crit.addOrder(Order.desc("songViewCount"));

		List results = crit.list();

		return results;



	}

	// get random song list
	public List<Service> getRandomList() throws Exception{
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Criteria crit = session.createCriteria(Service.class);
		crit.add(Restrictions.like("isApproved", "1"));
		crit.add(Restrictions.sqlRestriction("1=1 order by rand()"));
		crit.setMaxResults(10);
		List results = crit.list();
		return results;

	}
	// get song List. (id)
	@SuppressWarnings("unchecked")
	public List<Service> getSongList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Service> serviceList = session.createCriteria(Service.class)
				.list();
		tx.commit();
		session.close();
		return serviceList;
	}


	// for delete a song (with Id)
	public boolean deleteSong(long id)
			throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(Service.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}


	public List<Service> getIsNotApprovedSongs() throws Exception{
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Criteria crit = session.createCriteria(Service.class);
		crit.add(Restrictions.like("isApproved", "0"));
		crit.setMaxResults(10);
		List results = crit.list();
		return results;

	}


}
