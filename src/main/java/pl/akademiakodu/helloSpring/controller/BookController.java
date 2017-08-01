package pl.akademiakodu.helloSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.helloSpring.dao.BookDao;
import pl.akademiakodu.helloSpring.model.Book;

/**
 * Created by slickender on 27.07.2017.
 */
@Controller
public class BookController {

    @GetMapping("/loop")
    public String findAll(ModelMap modelMap) {
        modelMap.addAttribute("books", BookDao.findAll());
        return "loop";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Book book, ModelMap modelMap){
        modelMap.addAttribute("book",book);
        return "bookadd";
    }

}
