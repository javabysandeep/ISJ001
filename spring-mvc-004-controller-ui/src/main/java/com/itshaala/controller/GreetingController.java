package com.itshaala.controller;

import com.itshaala.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @RequestMapping("/data")
    public ModelAndView getData() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("data");
        //string type data to be added in the mav object
        //key{string}--value{object}
        modelAndView.addObject("greeting", "Good morning");

        //Greeting object
        Greeting greeting = new Greeting();
        greeting.setMorningGreeting("Its good morning");
        greeting.setAfternoonGreeting("its very good afternoon");
        greeting.setEveningGreeting("Its chilling evening");
        greeting.setNightGreeting("Good night");
        modelAndView.addObject("greetingObject",greeting);
        return modelAndView;
    }

}
