package com.yupi.project.service.impl;

import com.yupi.project.mapper.BookMapper;
import com.yupi.project.model.entity.Book;
import com.yupi.project.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public Book addBook(Book book) {
        bookMapper.insert(book);
        return book;
    }
}
