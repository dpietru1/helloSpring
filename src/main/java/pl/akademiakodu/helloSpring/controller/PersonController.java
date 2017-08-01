package pl.akademiakodu.helloSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.helloSpring.dao.BookDao;
import pl.akademiakodu.helloSpring.dao.PersonDao;
import pl.akademiakodu.helloSpring.dao.PersonDaoImpl;
import pl.akademiakodu.helloSpring.model.Person;

/**
 * Created by slickender on 28.07.2017.
 */
@Controller
public class PersonController {
    @GetMapping("/person/add")
    public String add() {
        return "person/add";
    }
    @PostMapping("/person/create")
    public String create(@ModelAttribute Person person, ModelMap modelMap){
        modelMap.addAttribute("person", person);
        return "person/show";
    }
    @GetMapping("/person/all")
    public String findAll(ModelMap modelMap) {
        PersonDaoImpl personDaoImpl=new PersonDaoImpl();
        modelMap.addAttribute("people", personDaoImpl.findAll());
        return "person/all";
    }
    @GetMapping("/person/search")
    public String search(){

        return "person/search";
    }
    @GetMapping("/person/results")
    public String results(@ModelAttribute Person person, ModelMap modelMap){
        String lastName=person.getSurname();
        PersonDaoImpl personDaoImpl=new PersonDaoImpl();
        modelMap.addAttribute("people", personDaoImpl.findByLastName(lastName));
        return "person/results";
    }

    @GetMapping("/person/{id}")
    public String display(@PathVariable Long id, @ModelAttribute Person person, ModelMap modelMap){
        Long ourId=person.getId();
        PersonDaoImpl personDaoImpl=new PersonDaoImpl();
        modelMap.addAttribute("id", personDaoImpl.findById(ourId));
        return "person/id";
    }
}
