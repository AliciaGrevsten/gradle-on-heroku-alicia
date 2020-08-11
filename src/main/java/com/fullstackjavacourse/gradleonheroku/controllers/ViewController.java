package com.fullstackjavacourse.gradleonheroku.controllers;
import com.fullstackjavacourse.gradleonheroku.models.Joke;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

    @GetMapping("/index")
    public String index() {
        return "/index";
    }

    @GetMapping("/showjoke")
    public String joke(Model model) {
        Joke joke = JokeController.getJoke();
        model.addAttribute("joke", joke);
        return "/joke";
    }

    @GetMapping("/registered")
    public String registered(@RequestParam(value = "email") String email, Model model) {
        model.addAttribute(email);
        return "/registered";
    }
}
