package com.romankushmiruk.gof.blinnov.behavioral.chainofresponsibility;

public class Authentification extends AbstractHandler {

    public Authentification() {
        // more code
    }

    @Override
    public void handleRequest(Employee user) {
        if (checkStatus(user)) {
            // some code here
        }
    }

    public boolean checkStatus(Employee user) {
        boolean flag = true;
        System.out.println(user);
        System.out.println("check user status"); // check user status
        return flag;
    }
}
