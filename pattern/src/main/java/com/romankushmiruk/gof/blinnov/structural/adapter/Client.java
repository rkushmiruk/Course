package com.romankushmiruk.gof.blinnov.structural.adapter;

public class Client {
    private Adapter target;

    public Client(Adapter target) {
        this.target = target;
    }

    public void execute(Adapter target) {
        target.request();
    }
}
