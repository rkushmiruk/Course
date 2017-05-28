package com.romankushmiruk.gof.blinnov.structural.proxy.base;

public class Proxy implements BaseInterface {
    private BaseClass base = null;

    public void perform() {
        base = new BaseClass();
        base.perform();
    }
}
