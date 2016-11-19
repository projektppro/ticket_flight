package com.ppro.persistence;

import com.ppro.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Arci on 10.11.2016.
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {


    @Qualifier("personRepository")
    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return (List<Person>) personRepository.findAll();
    }

    @Override
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public Person findOne(Integer id) {
        return personRepository.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        personRepository.delete(id);
    }

    @Override
    public List<Person> findByFirstname(String firstName) {
        return (List<Person>) personRepository.findByFirstname(firstName);
    }

    @Override
    public List<Person> findByLastname(String lastName) {
        return (List<Person>) personRepository.findByLastname(lastName);
    }

    @Override
    public List<Person> findByFirstnameAndLastname(String firstName, String lastName) {
        return (List<Person>) personRepository.findByFirstnameAndLastname(firstName,lastName);
    }

    @Override
    public List<Person> findByDateOfBirth(Date date) {
        return (List<Person>) personRepository.findByDateofbirth(date);
    }
}
