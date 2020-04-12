package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClassController {
    @RequestMapping("/class")
    public String addClass() {
        return "addClass";
    }

    @RequestMapping(value = "/doAddClass", method = RequestMethod.POST)
    @ResponseBody
    public void doAddClass(MyClass myClass) {
        System.out.println(myClass);
    }
}
