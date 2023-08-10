package com.itshaala.springboootspringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @GetMapping("/greet")
    public String greet() {
        return "greeting";
    }
}
