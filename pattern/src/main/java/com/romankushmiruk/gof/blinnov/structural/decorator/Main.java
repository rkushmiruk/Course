package com.romankushmiruk.gof.blinnov.structural.decorator;

public class Main {
    public static void main(String[] args) {
        IEmployee employee = new TesterDecorator(new Employee("Ivanov"));
        employee.reopenTask();
        employee = new TeamLeadDecorator(new Employee("Petrov"));
        employee.openTask();
    }
}
