package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    //DispatcherServlet
    //InternalResourceViewResolver
    @GetMapping("/greet")
    public String greet() {
        return "hello";
    }
}
