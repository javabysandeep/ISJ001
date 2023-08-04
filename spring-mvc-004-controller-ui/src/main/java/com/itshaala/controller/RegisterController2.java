package com.itshaala.controller;


import com.itshaala.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController2 {
    @RequestMapping("/register2")
    public ModelAndView register(@ModelAttribute User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registerSuccess2");
        modelAndView.addObject("userObject", user);
        return modelAndView;
    }
}
