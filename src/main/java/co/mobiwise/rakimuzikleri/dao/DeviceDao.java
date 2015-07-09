package co.mobiwise.rakimuzikleri.dao;

import co.mobiwise.rakimuzikleri.model.Device;

/**
 * Created by yusufcakmak on 7/9/15.
 */
public interface DeviceDao {

    public boolean addDevice(Device device) throws Exception;
}
