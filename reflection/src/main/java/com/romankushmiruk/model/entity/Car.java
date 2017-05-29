package com.romankushmiruk.model.entity;

import com.romankushmiruk.model.CarInterface;
import jdk.nashorn.internal.ir.annotations.Immutable;

@Immutable
public class Car implements CarInterface {
    private String mark;
    private int cylinders;
    private int power;

    public Car(String mark, int cylinders, int power) {
        this.mark = mark;
        this.cylinders = cylinders;
        this.power = power;
    }

    public void drive() {
        System.out.println("Car drive");
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car {" +
                "mark = " + mark +
                "number of cylinders = " + cylinders +
                "power = " + power +
                "}";
    }
}
