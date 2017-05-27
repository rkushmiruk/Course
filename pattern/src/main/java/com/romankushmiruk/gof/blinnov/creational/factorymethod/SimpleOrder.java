package com.romankushmiruk.gof.blinnov.creational.factorymethod;

public class SimpleOrder extends AbstractOrder {
    @Override
    public void perform() {
        System.out.println("SimpleOrder");
    }
}
