package com.fullstackjavacourse.gradleonheroku.models;

public class Joke {
    private String SetUp;
    private String Punchline;

    public Joke(String setUp, String punchline) {
        SetUp = setUp;
        Punchline = punchline;
    }

    public String getPunchline() {
        return Punchline;
    }

    public void setPunchline(String punchline) {
        Punchline = punchline;
    }

    public String getSetUp() {
        return SetUp;
    }

    public void setSetUp(String setUp) {
        SetUp = setUp;
    }
}
