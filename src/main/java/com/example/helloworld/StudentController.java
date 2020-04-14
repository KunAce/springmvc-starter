package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
    @RequestMapping("/student")
    public String addStudent() {
        return "addStudent";
    }

    @RequestMapping("/doAddStudent")
    @ResponseBody
    public void addStudent(@Validated Student student, BindingResult result) {
        if (result != null) {
            //Fail the validation.Get the exception information
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError allError: allErrors) {
                System.out.println(allError.getObjectName() + ":" + allError.getDefaultMessage());
            }
        }
    }
}
