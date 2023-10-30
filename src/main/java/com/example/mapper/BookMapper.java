package com.example.mapper;

import com.example.model.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {
    @Insert("INSERT INTO books (name, spec, purchase_date, purchase_price) " +
            "VALUES (#{name}, #{spec}, #{purchaseDate}, #{purchasePrice})")
    void createBook(Book book);
}
