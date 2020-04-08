package helloworld;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController implements Controller {
    /**
     * @param req the request
     * @param resp the response
     * @return Returns a ModelAndView
     * @throws Exception
     */

    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("name","javatest");
        return mv;
    }
}
