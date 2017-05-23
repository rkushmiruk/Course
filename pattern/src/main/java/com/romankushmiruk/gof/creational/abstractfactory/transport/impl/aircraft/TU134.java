package com.romankushmiruk.gof.creational.abstractfactory.transport.impl.aircraft;

import com.romankushmiruk.gof.creational.abstractfactory.transport.interfaces.Aircraft;

public class TU134 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("Flight TU134");
    }
}
