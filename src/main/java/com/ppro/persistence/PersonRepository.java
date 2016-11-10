package com.ppro.persistence;

import com.ppro.model.Airplane;
import com.ppro.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by Arci on 10.11.2016.
 */
public interface PersonRepository extends CrudRepository<Person,Integer>{
    Iterable<Person> findByFirstname(String firstName);
    Iterable<Person> findByLastname(String lastName);
    Iterable<Person> findByFirstnameAndLastname(String firstName,String lastName);
    Iterable<Person> findByDateofbirth(Date date);

}
