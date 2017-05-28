package com.romankushmiruk.gof.blinnov.structural.proxy.base;

public class Main {
    public static void main(String[] args) {
        BaseInterface base = new Proxy();
        base.perform();
    }
}
