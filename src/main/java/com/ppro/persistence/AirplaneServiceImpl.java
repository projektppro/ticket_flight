package com.ppro.persistence;

import com.ppro.model.Airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Arci on 10.11.2016.
 */
@Service("airplaneService")
public class AirplaneServiceImpl implements AirplaneServise {

    @Qualifier("airplaneRepository")
    @Autowired
    private AirplaneRepository airplaneRepository;

    @Override
    public List<Airplane> findAll() {
        return (List<Airplane>) airplaneRepository.findAll();
    }

    @Override
    public void saveAirplane(Airplane airplane) {
        airplaneRepository.save(airplane);
    }

    @Override
    public Airplane findOne(Integer id) {
        return airplaneRepository.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        airplaneRepository.delete(id);
    }

    @Override
    public List<Airplane> findByName(String name) {
        return (List<Airplane>) airplaneRepository.findByName(name);
    }
}
