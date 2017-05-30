package com.romankushmiruk;

import com.romankushmiruk.controller.Controller;
import com.romankushmiruk.model.Reflection;
import com.romankushmiruk.model.entity.Car;
import com.romankushmiruk.model.entity.CarProxy;
import com.romankushmiruk.model.entity.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", 23, 122313);
        Truck truck = new Truck("GAS", 212312, 134, 1231);
        CarProxy carProxy = new CarProxy(truck);

        Reflection reflection = new Reflection(carProxy);

        Controller controller = new Controller(reflection);
        controller.processUser();
    }
}
