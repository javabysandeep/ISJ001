package com.itshaala.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
    @RequestMapping("/register")
    public ModelAndView register(@RequestParam("username") String username,
                                 @RequestParam("city") String city) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registerSuccess");
        modelAndView.addObject("username", username);
        modelAndView.addObject("city", city);
        return modelAndView;
    }
}
