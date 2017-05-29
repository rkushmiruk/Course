package com.romankushmiruk;

import com.romankushmiruk.controller.Controller;
import com.romankushmiruk.model.Reflection;
import com.romankushmiruk.model.entity.Car;
import com.romankushmiruk.model.entity.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari",23,122313);
        Truck truck = new Truck("GAS",212312,134,1231);
        Reflection reflection = new Reflection(truck);


        Controller controller = new Controller(reflection);
        controller.processUser();
    }
}
