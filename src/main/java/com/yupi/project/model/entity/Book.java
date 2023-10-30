package com.yupi.project.model.entity;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String name;
    private String spec;
    private Float price;
    private Integer quantity;
}
