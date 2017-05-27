package com.romankushmiruk.gof.blinnov.creational.prototype;

public class Magazine extends Issue {
    private int number;

    public Magazine(Integer id, int number, String name, int year) {
        super(id, name, year);
        this.number = number;
    }
}
