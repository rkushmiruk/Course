package com.romankushmiruk.gof.blinnov.structural.decorator;

public class TeamLeadDecorator extends EmployeeDecorator {
    // поля, методы
    public TeamLeadDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void openTask() {
        super.openTask();
        assignTask();
    }

    @Override
    public void reopenTask() {
        super.reopenTask();
        changeEmployee();
    }

    @Override
    public void resolveTask() {
        super.resolveTask();
        closeTask();
    }

    public void assignTask() {
        System.out.println(employee.getName() + " is assigning task");
    }

    public void changeEmployee() {
        System.out.println(employee.getName() + " is changing employee");
    }

    public void closeTask() {
        System.out.println(employee.getName() + " is closing task");
    }
}
