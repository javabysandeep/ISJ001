package com.itshaala.springbootrest002.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    @GetMapping("/greet")
    public String greetGet() {
        return "Greetings from GET method";
    }

    @PostMapping("/greet")
    public String greetPost() {
        return "Greetings from POST method";
    }

    @PutMapping("/greet")
    public String greetPut() {
        return "Greetings from PUT method";
    }

    @DeleteMapping("/greet")
    public String greetDelete() {
        return "Greetings from DELETE method";
    }

    @PatchMapping("/greet")
    public String greetPatch() {
        return "Greetings from PATCH method";
    }
}
