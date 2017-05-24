package com.romankushmiruk.gof.brovko.creational.abstractfactory.transport.impl.aircraft;

import com.romankushmiruk.gof.brovko.creational.abstractfactory.transport.interfaces.Aircraft;

public class Boeing747 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("Flight Boeing747");
    }
}
