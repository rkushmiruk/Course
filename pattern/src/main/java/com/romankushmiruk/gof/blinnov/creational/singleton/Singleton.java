package com.romankushmiruk.gof.blinnov.creational.singleton;

public class Singleton {
    private Singleton() {
    }

    private static class SingletonHolder { // nested class
        private final static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}