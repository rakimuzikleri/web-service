package co.mobiwise.rakimuzikleri.controller;

import co.mobiwise.rakimuzikleri.model.Status;
import co.mobiwise.rakimuzikleri.dao.DeviceDao;
import co.mobiwise.rakimuzikleri.model.Device;
import co.mobiwise.rakimuzikleri.services.DeviceService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yusufcakmak on 7/9/15.
 */
@Controller
@RequestMapping("/api/device")
public class DeviceController {

    @Autowired
    DeviceService deviceService;

    @Autowired
    DeviceDao deviceDao;

    static final Logger logger = Logger.getLogger(SongController.class);


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public
    @ResponseBody
    Status addDevice(Device device) {
        try {
            Device device1 = new Device();
            deviceService.addDevice(device1);
            return new Status(1, "Song added Successfully !");
        } catch (Exception e) {
            return new Status(0, e.toString());

        }


    }
}
