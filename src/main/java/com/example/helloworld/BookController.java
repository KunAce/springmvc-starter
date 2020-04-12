package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class BookController {
    @RequestMapping("/book")
    public String addBook() {
        return "addBook";
    }

    @RequestMapping(value="/doAdd", method = RequestMethod.POST)
    @ResponseBody
    public void doAdd(Book book, String[] hobbies) {
        System.out.println(Arrays.toString(hobbies));
        System.out.println(book);
    }
//    public void doAdd(@RequestParam(value="name", required = true, defaultValue = "Default Book") String bookname, String author, Double price, Boolean ispublic) {
//        // The field name in the form should be the same with the parameter here except using @RequestParam
//        System.out.println(bookname);
//        System.out.println(author);
//        System.out.println(price);
//        System.out.println(ispublic);
//    }
}
