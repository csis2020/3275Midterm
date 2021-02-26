package com.example.randomJoke.service;

import com.example.randomJoke.model.RandomJokes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RandomJokeService {
    //@Autowired
    private RandomJokes rJokes = new RandomJokes();

    public String getRandomQuote(){
        return rJokes.getRandomJokes();
    }

}
