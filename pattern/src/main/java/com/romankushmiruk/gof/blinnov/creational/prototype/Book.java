package com.romankushmiruk.gof.blinnov.creational.prototype;

public class Book extends Issue {
    private String author;

    public Book(Integer id, String author, String name, int year) {
        super(id, name, year);
        this.author = author;
    }
}
