package com.romankushmiruk.gof.creational.abstractfactory.transport.impl.car;

import com.romankushmiruk.gof.creational.abstractfactory.transport.interfaces.Car;

public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Drive Porsche");
    }

    @Override
    public void stop() {
        System.out.println("Stop Porsche");
    }
}
