package com.romankushmiruk.model.entity;

import com.romankushmiruk.model.CarInterface;

public class CarProxy implements CarInterface {
    private Car car = null;

    public CarProxy(String mark, int cylinders, int power) {
        car = new Car(mark, cylinders, power);
    }
    public CarProxy(Car car){
        this.car = car;
    }

    @Override
    public void drive() {
        car.drive();
    }

    public String getMark() {
        return car.getMark();
    }

    public void setMark(String mark) {
        throw new UnsupportedOperationException();
    }

    public int getCylinders() {
        return car.getCylinders();
    }

    public void setCylinders(int cylinders) {
        throw new UnsupportedOperationException();
    }

    public int getPower() {
        return car.getPower();
    }

    public void setPower(int power) {
        throw new UnsupportedOperationException();
    }
}
