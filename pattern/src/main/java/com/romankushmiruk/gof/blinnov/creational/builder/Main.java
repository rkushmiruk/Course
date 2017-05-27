package com.romankushmiruk.gof.blinnov.creational.builder;

public class Main {
    public static void main(String[] args) {
        User user1 = Director.createUser(new DOMBuilder());
        User user2 = Director.createUser(new SAXBuilder());
    }
}
