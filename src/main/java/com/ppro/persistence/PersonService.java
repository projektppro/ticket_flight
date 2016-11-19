package com.ppro.persistence;

import com.ppro.model.Person;

import java.util.Date;
import java.util.List;

/**
 * Created by Arci on 10.11.2016.
 */
public interface PersonService {
    List<Person> findAll();

    void savePerson(Person person);

    Person findOne(Integer id);

    void delete(Integer id);

    List<Person> findByFirstname(String firstName);

    List<Person> findByLastname(String lastName);

    List<Person> findByFirstnameAndLastname(String firstName,String lastName);

    List<Person> findByDateOfBirth(Date date);
}
