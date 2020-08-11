package com.fullstackjavacourse.gradleonheroku;

import com.fullstackjavacourse.gradleonheroku.models.Joke;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class GradleOnHerokuApplication {

    private static ArrayList<Joke> jokes = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(GradleOnHerokuApplication.class, args);
        generatejokes();
    }

    public static ArrayList<Joke> getJokes() {
        return jokes;
    }

    public static void generatejokes() {
        jokes.add(new Joke(
                "What did the fish say when it hit the wall?",
                "Dam."
        ));

        jokes.add(new Joke(
                "How do you make a tissue dance?",
                "You put a little boogie on it."
        ));

        jokes.add(new Joke(
                "What's Forrest Gump's password?",
                "1Forrest1"
        ));

        jokes.add(new Joke(
                "What do you call a belt made out of watches?",
                "A waist of time."
        ));

        jokes.add(new Joke(
                "Why can't bicycles stand on their own?",
                "They are two tired"));

        jokes.add(new Joke(
                "How does a train eat?",
                "It goes chew, chew"));

        jokes.add(new Joke(
                "What do you call a singing Laptop",
                "A Dell"));

        jokes.add(new Joke(
                "How many lips does a flower have?",
                "Tulips"));

        jokes.add(new Joke(
                "How do you organize an outer space party?",
                "You planet"));

        jokes.add(new Joke(
                "What kind of shoes does a thief wear?",
                "Sneakers"));

        jokes.add(new Joke(
                "What's the best time to go to the dentist?",
                "Tooth hurty."));

        jokes.add(new Joke(
                "Knock knock. \n Who's there? \n A broken pencil. \n A broken pencil who?",
                "Never mind. It's pointless."));

        jokes.add(new Joke(
                "Knock knock. \n Who's there? \n Cows go. \n Cows go who?",
                "No, cows go moo."));

        jokes.add(new Joke(
                "Knock knock. \n Who's there? \n Little old lady. \n Little old lady who?",
                "I didn't know you could yodel!"));

        jokes.add(new Joke(
                "What's the best thing about a Boolean?",
                "Even if you're wrong, you're only off by a bit."));

        jokes.add(new Joke(
                "What's the object-oriented way to become wealthy?",
                "Inheritance"));

        jokes.add(new Joke(
                "Where do programmers like to hangout?",
                "The Foo Bar."));

        jokes.add(new Joke(
                "Why did the programmer quit his job?",
                "Because he didn't get arrays."));

        jokes.add(new Joke(
                "Did you hear about the two silk worms in a race?",
                "It ended in a tie."));

        jokes.add(new Joke(
                "What do you call a laughing motorcycle?",
                "A Yamahahahaha."));

        jokes.add(new Joke(
                "A termite walks into a bar and says...",
                "'Where is the bar tended?'"));

    }
}
