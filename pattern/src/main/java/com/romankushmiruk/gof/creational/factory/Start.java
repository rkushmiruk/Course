package com.romankushmiruk.gof.creational.factory;

public class Start {
    public static void main(String[] args) {
        Car geep = new Geep();
        geep.drive();

        Car porshe = new Porsche();
        porshe.drive();

        CarSelector carSelector = new CarSelector();
        Car car = carSelector.getCar(RoadType.CITY);
    }
}
