package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class HelloWorldController {
    @RequestMapping(value = {"/helloworld", "/helloworld2"}, method= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
    public ModelAndView hello() {
        System.out.println("Say Hello to the World!");
        return new ModelAndView("helloworld");
    }
}
