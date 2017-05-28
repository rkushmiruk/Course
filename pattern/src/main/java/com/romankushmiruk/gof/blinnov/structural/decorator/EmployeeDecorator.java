package com.romankushmiruk.gof.blinnov.structural.decorator;

public class EmployeeDecorator implements IEmployee {
    protected Employee employee;

    public EmployeeDecorator() {
        super();
    }

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void resolveTask() {
        employee.resolveTask();
    }

    @Override
    public void openTask() {
        employee.openTask();
    }

    @Override
    public void reopenTask() {
        employee.reopenTask();
    }
}
