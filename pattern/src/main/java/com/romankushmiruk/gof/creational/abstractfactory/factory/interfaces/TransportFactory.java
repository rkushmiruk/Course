package com.romankushmiruk.gof.creational.abstractfactory.factory.interfaces;

import com.romankushmiruk.gof.creational.abstractfactory.transport.interfaces.Aircraft;
import com.romankushmiruk.gof.creational.abstractfactory.transport.interfaces.Car;

//create fabric of transport
public interface TransportFactory {
    Car createCar();

    Aircraft createAircraft();
}
