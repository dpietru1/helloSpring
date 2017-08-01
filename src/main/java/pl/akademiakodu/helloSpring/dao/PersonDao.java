package pl.akademiakodu.helloSpring.dao;

import pl.akademiakodu.helloSpring.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slickender on 28.07.2017.
 */
public interface PersonDao {
    List<Person> findByLastName(String lastName);
    List<Person> findAll();
    Person findById(Long id);
}
