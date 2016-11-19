package com.ppro.persistence;

import com.ppro.model.Airplane;

import java.util.List;

/**
 * Created by Arci on 10.11.2016.
 */
public interface AirplaneServise {
     List<Airplane> findAll();
    
     void saveAirplane(Airplane airplane);
    
     Airplane findOne(Integer id);
    
     void delete(Integer id);
    
     List<Airplane> findByName(String name);
}
