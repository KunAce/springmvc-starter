package com.example.helloworld;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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

    // For testing returned JSON
    @RequestMapping("/book-example")
    @ResponseBody
    public Book getBookById() {
        Book book1 = new Book();
        Author author1 = new Author();
        author1.setName("Tolkien");
        author1.setAge(88);
        book1.setName("The Lord of The Rings");
        book1.setAuthor(author1);
        book1.setPrice(120.00);
        book1.setIspublic(true);
        book1.setDate(new Date());
        return book1;
    }

    @RequestMapping("/books-example")
    @ResponseBody
    public List<Book> getAllBooks() {
        List<Book> list = new ArrayList<Book>();
        for (int i = 1; i < 10; i++) {
            Book book = new Book();
            book.setName("Book-" + i);
            book.setPrice(i + 100.0);
            book.setIspublic(true);
            book.setDate(new Date());
            list.add(book);
        }
        return list;
    }

    // Receive JSON from frontend
    @RequestMapping(value= "/doAdd2")
    @ResponseBody
    public void doAdd2(HttpServletRequest req) throws IOException {
        ObjectMapper om = new ObjectMapper();
        Book book = om.readValue(req.getInputStream(), Book.class);
        System.out.println(book);
    }

    @RequestMapping(value="/doAdd3")
    @ResponseBody
    public void doAdd3(@RequestBody Book book) {
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
