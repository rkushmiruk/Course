package com.romankushmiruk.gof.creational.abstractfactory.factory.impl;

import com.romankushmiruk.gof.creational.abstractfactory.factory.interfaces.TransportFactory;
import com.romankushmiruk.gof.creational.abstractfactory.transport.impl.aircraft.TU134;
import com.romankushmiruk.gof.creational.abstractfactory.transport.impl.car.Niva;
import com.romankushmiruk.gof.creational.abstractfactory.transport.interfaces.Aircraft;
import com.romankushmiruk.gof.creational.abstractfactory.transport.interfaces.Car;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
