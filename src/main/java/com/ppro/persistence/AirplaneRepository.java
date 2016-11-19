package com.ppro.persistence;

import com.ppro.model.Airplane;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Arci on 10.11.2016.
 */
public interface AirplaneRepository extends CrudRepository<Airplane,Integer> {
    Iterable<Airplane> findByName(String name);
}
