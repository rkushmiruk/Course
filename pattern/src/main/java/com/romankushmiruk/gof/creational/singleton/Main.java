package com.romankushmiruk.gof.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.print();
        singleton.print();
        singleton.print();
    }
}
