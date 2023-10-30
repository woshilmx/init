package com.yupi.project.controller;

import com.yupi.project.model.entity.Book;
import com.yupi.project.service.BookService;
import com.yupi.project.vo.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/books")
    public BaseResponse<Book> addBook(@RequestBody Book book) {
        Book addedBook = bookService.addBook(book);
        return new BaseResponse<>(addedBook);
    }
}
