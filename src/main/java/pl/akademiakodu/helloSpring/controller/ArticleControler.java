package pl.akademiakodu.helloSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akademiakodu.helloSpring.model.Article;

/**
 * Created by slickender on 27.07.2017.
 */
@Controller
public class ArticleControler {
    @GetMapping("/add")
    public String add() {
        return "add";
    }
    @GetMapping("/show")
    public String show(@ModelAttribute Article article, ModelMap modelMap){
        modelMap.addAttribute("article", article);
        return "show";

    }
}
