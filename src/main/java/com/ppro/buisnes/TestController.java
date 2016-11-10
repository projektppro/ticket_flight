package com.ppro.buisnes;

import com.ppro.dao.CityRepository;
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

    @RequestMapping("/")
    @ResponseBody
    public String sample(){
        City s = new City();
        s.setName("hk");
        s.setId(5);
        cityRepository.save(s);
        return "ahoj";
    }
}
