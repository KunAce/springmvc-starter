package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController3 {
    @RequestMapping("/hello3")
    public ModelAndView hello() {
        return new ModelAndView("hello3");
    }
}