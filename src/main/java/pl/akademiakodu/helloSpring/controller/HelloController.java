package pl.akademiakodu.helloSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.helloSpring.model.Lotto;

import java.util.*;

/**
 * Created by slickender on 27.07.2017.
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("person", "Damian");
        return "hello";
    }
    @ResponseBody
    @GetMapping("/hello")
    public String hello1(){
        return "Hello Damian Pietruczuk!";
    }
    @GetMapping("/random")
    public String random(ModelMap modelMap){
        modelMap.addAttribute("a", "Liczby na dziś");
        modelMap.addAttribute("numbers", Lotto.getRandomNumbers());
        return "random";
    }

    @GetMapping("/if")
    public String ifStatement(ModelMap modelMap){
        modelMap.addAttribute("text","Michał");
        modelMap.addAttribute("myText","Sample text");
        modelMap.addAttribute("a",123);
        modelMap.addAttribute("b",456);
        return "if";
    }
    @GetMapping("/bookadd")
    public String bookaddSwitch(ModelMap modelMap){
        return "bookadd";
    }
}
