package co.mobiwise.rakimuzikleri.dao.impl;

import co.mobiwise.rakimuzikleri.dao.DeviceDao;
import co.mobiwise.rakimuzikleri.model.Device;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yusufcakmak on 7/9/15.
 */
public class DeviceDaoImpl implements DeviceDao {

    @Autowired
    SessionFactory sessionFactory;

    Session session = null;
    Transaction tx = null;

    public boolean addDevice(Device device) throws Exception {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(device);
        tx.commit();
        session.close();

        return false;
    }

}
