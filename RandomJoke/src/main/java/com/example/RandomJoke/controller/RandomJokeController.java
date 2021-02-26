package com.example.randomJoke.controller;

import com.example.randomJoke.service.RandomJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class RandomJokeController {

    //@Autowired
    private RandomJokeService rJokesService = new RandomJokeService();

    @GetMapping
    public String getRandomQuote(){
        return rJokesService.getRandomQuote();
    }

    @RequestMapping("/")
    public String myController(){

        return "index"; //home page 를 보여줌.

    }

    /*
    @RequestMapping("/") //homepage 라는데???
    public String myController(@ModelAttribute("joke") Model model){
        //return "List of all items in this page.";
        return "index"; //home page 를 보여줌.

    }
    */

}
