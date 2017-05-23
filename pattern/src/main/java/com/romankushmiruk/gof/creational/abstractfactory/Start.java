package com.romankushmiruk.gof.creational.abstractfactory;

import com.romankushmiruk.gof.creational.abstractfactory.factory.impl.RussianFactory;
import com.romankushmiruk.gof.creational.abstractfactory.factory.interfaces.TransportFactory;

public class Start {
    public static void main(String[] args) {
        TransportFactory russianFactory = new RussianFactory();

        System.out.println(russianFactory.createCar());
    }
}
