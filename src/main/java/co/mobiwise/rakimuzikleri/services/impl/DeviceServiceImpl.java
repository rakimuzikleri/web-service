package co.mobiwise.rakimuzikleri.services.impl;

import co.mobiwise.rakimuzikleri.dao.DeviceDao;
import co.mobiwise.rakimuzikleri.services.DeviceService;
import co.mobiwise.rakimuzikleri.model.Device;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yusufcakmak on 7/9/15.
 */
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    DeviceDao deviceDao;

    public boolean addDevice(Device device) throws Exception{
        return deviceDao.addDevice(device);
    }
}
