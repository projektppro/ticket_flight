package com.ppro.persistence;

import com.ppro.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Arci on 9.11.2016.
 */
@Repository
public interface CityRepository extends CrudRepository<City,Integer> {

}
