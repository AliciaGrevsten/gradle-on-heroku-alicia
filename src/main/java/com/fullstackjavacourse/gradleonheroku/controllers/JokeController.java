package com.fullstackjavacourse.gradleonheroku.controllers;

import com.fullstackjavacourse.gradleonheroku.GradleOnHerokuApplication;
import com.fullstackjavacourse.gradleonheroku.models.Joke;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;


@RestController
public class JokeController {

    @GetMapping("/joke")
    public static Joke getJoke() {
        ArrayList<Joke> jokes = GradleOnHerokuApplication.getJokes();

        Random ran = new Random();
        int ranIndex = ran.nextInt(jokes.size());

        return jokes.get(ranIndex);
    }

    @GetMapping("/joke/all")
    public static ArrayList<Joke> getJokes() {
        return GradleOnHerokuApplication.getJokes();
    }

}
