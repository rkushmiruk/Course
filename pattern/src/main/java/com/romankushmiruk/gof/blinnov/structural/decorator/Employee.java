package com.romankushmiruk.gof.blinnov.structural.decorator;

public class Employee implements IEmployee {
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void openTask() {
        System.out.println(this.getName() + " open task");
    }

    @Override
    public void reopenTask() {
        System.out.println(this.getName() + " reopen task");
    }

    @Override
    public void resolveTask() {
        System.out.println(this.getName() + " resolve task");
    }
}
