package com.romankushmiruk.gof.blinnov.behavioral.chainofresponsibility;

public class RoleManager extends AbstractHandler {
    public RoleManager(){
    }

    @Override
    public void handleRequest(Employee user) {
        checkPermission();
    }

    public void checkPermission() {
        System.out.println("checking role"); // checking role
    }
}
