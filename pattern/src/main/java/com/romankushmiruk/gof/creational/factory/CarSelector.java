package com.romankushmiruk.gof.creational.factory;

//fabric method
public class CarSelector {

    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Porsche();
                break;
            case GAZON:
                car = new Porsche();
                break;
        }
        return car;
    }
}
