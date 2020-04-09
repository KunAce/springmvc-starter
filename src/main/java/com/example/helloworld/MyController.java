package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import com.example.service.HelloService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@org.springframework.stereotype.Controller("/hello")
public class MyController implements Controller {
    @Autowired
    HelloService helloService;
    /**
     * @param req the request
     * @param resp the response
     * @return Returns a ModelAndView
     * @throws Exception
     */

    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println(helloService.hello("This is the service!"));
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("name","javatest");
        return mv;
    }
}
