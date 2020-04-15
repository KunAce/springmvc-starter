package com.example.helloworld;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor2 implements HandlerInterceptor {
    /**
     * The method for pre-processing requests.
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     *
     */

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor2: preHandle");
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor2: postHandler");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,Exception e) throws Exception {
        System.out.println("MyInterceptor2: afterCompletion");
    }
}
