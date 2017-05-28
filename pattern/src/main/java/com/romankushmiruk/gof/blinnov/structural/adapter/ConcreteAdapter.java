package com.romankushmiruk.gof.blinnov.structural.adapter;

public class ConcreteAdapter implements Adapter {
    private Adaptee adaptee;

    public ConcreteAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("Return type - void.");
        adaptee.specificRequest();
    }
}
