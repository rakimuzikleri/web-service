package co.mobiwise.rakimuzikleri.services.impl;

import java.util.List;

import co.mobiwise.rakimuzikleri.dao.SongDao;
import co.mobiwise.rakimuzikleri.services.SongServices;
import co.mobiwise.rakimuzikleri.model.Service;
import org.springframework.beans.factory.annotation.Autowired;

public class SongServicesImpl implements SongServices {

	@Autowired
	SongDao dataDao;
	

	public boolean addSong(Service service) throws Exception {
		return dataDao.addSong(service);
	}


	public Service getSongById(long id) throws Exception {
		return dataDao.getSongById(id);
	}



	public List<Service> getMostViewList()throws Exception{
		return dataDao.getMostViewList();
	}

	public List<Service> getRandomList() throws Exception{
		return  dataDao.getRandomList();
	}


	public List<Service> getSongList() throws Exception {
		return dataDao.getSongList();
	}


	public boolean deleteSong(long id) throws Exception {
		return dataDao.deleteSong(id);
	}

	public List<Service> getIsNotApprovedSongs() throws Exception{
		return dataDao.getIsNotApprovedSongs();
	}



}
