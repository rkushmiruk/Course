package com.romankushmiruk.model.entity;

import com.romankushmiruk.exception.OutOfCargoException;
import com.romankushmiruk.model.CarInterface;
import com.romankushmiruk.model.CargoAnnotation;

public class Truck extends Car implements CarInterface {
    private int carrying;

    public Truck(String mark, int cylinders, int power, int carrying) {
        super(mark, cylinders, power);
        this.carrying = carrying;
    }

    @Override
    public void drive() {
        System.out.println("Truck drive");
    }

    @CargoAnnotation
    public int takeCargo(int cargo) throws OutOfCargoException {
        if (cargo > carrying) {
            throw new OutOfCargoException();
        }

        return cargo;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Truck {" +
                "carrying = " + carrying +
                '}';
    }
}
