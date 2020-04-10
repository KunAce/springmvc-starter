package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/user")
public class HelloWorldController {
    @RequestMapping(value = "/helloworld", method= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
    public ModelAndView hello() {
        System.out.println("Say Hello to the World!");
        ModelAndView mv = new ModelAndView("helloworld");
        mv.addObject("username","javatest");
        return mv;
    }

    // server forward
    @RequestMapping("/helloworld2")
    public void hello2(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/hello.jsp").forward(req,resp);
    }

    // client redirect
    @RequestMapping("/helloworld3")
    public void hello3(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/jsp/hello.jsp");
    }

    // redirect by manually setting response header
    @RequestMapping("/helloworld4")
    public void hello4(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setStatus(302);
        resp.addHeader("Location","/jsp/hello.jsp");
    }

    // return the response through HttpServletResponse
    @RequestMapping("/helloworld5")
    public void hello5(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.write("hello New Test");
        out.flush();
        out.close();
    }

    // return String with special function
    @RequestMapping("/helloworld6")
    public String hello6(Model model) {
        model.addAttribute("username","TheDataModel");
//        return "hello"; // return the logical view
//        return "forward:/jsp/hello.jsp"; // server forward
        return "redirect:/user/hello"; // client redirect
    }

    // return real String
    @RequestMapping(value = "helloworld7", produces = "text/html;charset=utf-8") // by Setting charset in 'produces' to avoid mojibakes
    @ResponseBody
    public String hello7() {
        return "redirect:/user/hello";
    }

}
