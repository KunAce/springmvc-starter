package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {
    @RequestMapping("/student")
    public String addStudent() {
        return "addStudent";
    }

    @RequestMapping("/doAddStudent")
    public String addStudent(@ModelAttribute("stu") @Validated(validationGroup2.class) Student student, BindingResult result) {
        if (result.hasErrors()) {
            //Fail the validation.Get the exception information
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError allError: allErrors) {
                System.out.println(allError.getObjectName() + ":" + allError.getDefaultMessage());
            }
            return "addStudent";
        }
        return "hello";
    }

    // Define global data
    @ModelAttribute("info")
    public Map<String, Object> info() {
        Map<String, Object> map = new HashMap<>();
        map.put("username","javatest");
        map.put("address","www.javatest.com");
        return map;
    }
}
