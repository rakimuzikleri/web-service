package co.mobiwise.rakimuzikleri.controller;

import co.mobiwise.rakimuzikleri.dao.SongDao;
import co.mobiwise.rakimuzikleri.model.Service;
import co.mobiwise.rakimuzikleri.model.ServiceReturn;
import co.mobiwise.rakimuzikleri.model.Status;
import co.mobiwise.rakimuzikleri.services.SongServices;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/api/service")
public class SongController {

    @Autowired
    SongServices dataServices;

    @Autowired
    SongDao dataDao;

    static final Logger logger = Logger.getLogger(SongController.class);

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public
    @ResponseBody
    Status addSong(@RequestParam String songName,
                   @RequestParam String singerName,
                   @RequestParam String songUrl){
        try {
            Service service1 = new Service();
            service1.setSingerName(singerName);
            service1.setSongName(songName);
            service1.setSongUrl(songUrl);
            service1.setIsApproved("0");

            dataServices.addSong(service1);
            return new Status(1, "Song added Successfully !");
        } catch (Exception e) {
            return new Status(0, e.toString());

        }
    }

    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    Service getSong(@PathVariable("id") long id) {
        Service service = null;


        try {
            service = dataServices.getSongById(id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return service;
    }



    @RequestMapping(value = "/random", method = RequestMethod.GET)
    public
    @ResponseBody
    ServiceReturn getRandomList() {
        List<Service> songList = null;
        ServiceReturn serviceReturn = new ServiceReturn();

        try {

            songList = dataServices.getRandomList();
            serviceReturn.setServiceList(songList);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return serviceReturn;
    }

    @RequestMapping(value = "/songs", method = RequestMethod.GET)
    public
    @ResponseBody
    ServiceReturn getSong() {
        List<Service> songList = null;
        ServiceReturn serviceReturn = new ServiceReturn();

        try {
            songList = dataServices.getSongList();

            serviceReturn.setServiceList(songList);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return serviceReturn;
    }

    @RequestMapping(value="/mostView", method =  RequestMethod.GET)
    public
    @ResponseBody
    ServiceReturn getMostSongViewList(){
        List<Service> mostViewList =null;
        ServiceReturn serviceReturn = new ServiceReturn();
        try{
            mostViewList = dataServices.getMostViewList();
            serviceReturn.setServiceList(mostViewList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return serviceReturn;
    }



    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    Status deleteSong(@PathVariable("id") long id) {
        try {
            dataServices.deleteSong(id);
            return new Status(1, "Song deleted Successfully !");
        } catch (Exception e) {
            return new Status(0, e.toString());
        }
    }

    @RequestMapping(value = "/notApproved", method = RequestMethod.GET)
    public
    @ResponseBody
    ServiceReturn getIsNotApprovedSongs(){
        List<Service> notApprovedSongList =null;
        ServiceReturn serviceReturn = new ServiceReturn();
        try{
            notApprovedSongList = dataServices.getIsNotApprovedSongs();
            serviceReturn.setServiceList(notApprovedSongList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return serviceReturn;
    }



}
