package com.romankushmiruk.gof.brovko.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.print();
        singleton.print();
        singleton.print();
    }
}
