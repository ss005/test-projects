package com.test.mvchbnrest.controller;

import com.test.mvchbnrest.entity.Book;
import com.test.mvchbnrest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookMVCController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/getbooks")
    public ModelAndView viewBooks() {
        //prefix and suffix already set into spring configuration file.
        ModelAndView modelAndView = new ModelAndView("books");
        //BookService bookService = new BookServiceImp();
        List<Book> booksList = bookService.list();
        for (Book book : booksList) {
            System.out.println(book);
        }
        modelAndView.addObject("bookList", booksList);

        return  modelAndView;
    }
}
