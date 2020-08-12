package com.fullstackjavacourse.gradleonheroku.controllers;
import com.fullstackjavacourse.gradleonheroku.GradleOnHerokuApplication;
import com.fullstackjavacourse.gradleonheroku.models.Joke;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Random;

@Controller
public class JokeController {

    @GetMapping("/")
    public String index() {
        return "/index";
    }

    @GetMapping("/joke")
    public String joke(Model model) {
        ArrayList<Joke> jokes = GradleOnHerokuApplication.getJokes();

        Random ran = new Random();
        int ranIndex = ran.nextInt(jokes.size());
        Joke joke = jokes.get(ranIndex);
        model.addAttribute("joke", joke);
        return "/joke";
    }

    @GetMapping("/registered")
    public String registered(@RequestParam(value = "email") String email, Model model) {
        model.addAttribute(email);
        return "/registered";
    }
}
