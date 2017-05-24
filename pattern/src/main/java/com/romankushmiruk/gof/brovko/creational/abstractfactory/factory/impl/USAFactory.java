package com.romankushmiruk.gof.brovko.creational.abstractfactory.factory.impl;

import com.romankushmiruk.gof.brovko.creational.abstractfactory.factory.interfaces.TransportFactory;
import com.romankushmiruk.gof.brovko.creational.abstractfactory.transport.impl.aircraft.TU134;
import com.romankushmiruk.gof.brovko.creational.abstractfactory.transport.impl.car.Porsche;
import com.romankushmiruk.gof.brovko.creational.abstractfactory.transport.interfaces.Aircraft;
import com.romankushmiruk.gof.brovko.creational.abstractfactory.transport.interfaces.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
