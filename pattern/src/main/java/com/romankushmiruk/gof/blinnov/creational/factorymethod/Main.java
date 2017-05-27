package com.romankushmiruk.gof.blinnov.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        AbstractOrder ob1 = OrderFactory.createOrderFromFactory("simple");
        AbstractOrder ob2 = OrderFactory.createOrderFromFactory("extended");

        ob1.perform();
        ob2.perform();
    }
}
