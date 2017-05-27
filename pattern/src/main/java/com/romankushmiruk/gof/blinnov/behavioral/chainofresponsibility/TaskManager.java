package com.romankushmiruk.gof.blinnov.behavioral.chainofresponsibility;

public class TaskManager extends AbstractHandler {

    public TaskManager() {
        // more code
    }

    @Override
    public void handleRequest(Employee user) {
        assignTask();
    }

    public void assignTask() {
        System.out.println("assign task");
    }
}
