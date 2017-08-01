package pl.akademiakodu.helloSpring.dao;

import pl.akademiakodu.helloSpring.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slickender on 31.07.2017.
 */
public class PersonDaoImpl implements PersonDao{


    private static List<Person> people = new ArrayList<>();


    public PersonDaoImpl() {
    }

    static {
        people.add(new Person(1L,"Adam", "Kowalski"));
        people.add(new Person(2L,"Jonek", "Kowalewski"));
        people.add(new Person(3L,"Felek", "Kowaluski"));
        people.add(new Person(4L,"Kapalapa", "Kowalski"));
        people.add(new Person(5L,"Alladyn", "Kowalski"));
    }

    @Override
    public List<Person> findByLastName(String lastName){
        List<Person> chosenOnes=new ArrayList<>();
            for (Person person: people){
                if (lastName.equals(person.getSurname()))
                    chosenOnes.add(new Person (person.getName(), person.getSurname()));
            }
        return chosenOnes;
    }
    @Override
    public List<Person> findAll(){
        return people;
    }

    @Override
    public Person findById(Long Id){
        Person ourGuy=new Person();
        for (Person person: people){
            if (Id.longValue()==person.getId().longValue())
                ourGuy=person;
        }
        return ourGuy;
    }
}
