package com.jll.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/a")
    @ResponseBody
    public String test1(){
        return "Hello SpringBoot JDK 1.6";
    }

    @RequestMapping("/b")
    @ResponseBody
    public String test2(){
        this.bookService.findById();
        return "Hello SpringBoot JDK 1.6";
    }

    @RequestMapping("/c")
    public String test3(){
//        this.bookService.findById();
        return "h.html";
    }
}
