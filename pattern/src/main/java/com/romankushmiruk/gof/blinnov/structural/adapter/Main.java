package com.romankushmiruk.gof.blinnov.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Adapter target = new ConcreteAdapter(new Adaptee());
        Client client = new Client(target);
        client.execute(target);
    }
}
