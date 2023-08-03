package com.itshaala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hi")
    public String hi() {
        return "hi";
    }
}
