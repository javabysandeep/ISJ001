package com.itshaala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingController {
   // @RequestMapping(method = RequestMethod.GET, value = "/greet")
    @GetMapping("/greet")
    public String greet(){
        return "greeting";
    }
}
