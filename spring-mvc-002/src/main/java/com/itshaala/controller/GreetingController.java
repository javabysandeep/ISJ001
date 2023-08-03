package com.itshaala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.http.HttpRequest;

@Controller
public class GreetingController {
    public GreetingController() {
        System.out.println("Greeting Controller Object created");

    }

    @RequestMapping(method = RequestMethod.GET, value = "/greet")
    //@GetMapping("/greet")
    public String greet(@RequestParam("username") String username) {

        return "greeting";
    }
}
