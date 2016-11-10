package com.ppro.controllers;

import com.ppro.model.Airplane;
import com.ppro.persistence.AirplaneServiceImpl;
import com.ppro.persistence.CityRepository;
import com.ppro.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Arci on 9.11.2016.
 */
@Controller
public class TestController {


    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private AirplaneServiceImpl airplaneService;


    @RequestMapping("/")
    @ResponseBody
    public String sample(){
        City s = new City();
        s.setName("hk");
        s.setId(5);
        cityRepository.save(s);

        Airplane airplane = new Airplane();
        airplane.setId(8);
        airplane.setName("BumboJet");
        airplaneService.saveAirplane(airplane);
        return "ahoj";
    }
}
