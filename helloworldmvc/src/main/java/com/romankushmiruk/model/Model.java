package com.romankushmiruk.model;

public class Model {
    private String message = "";

    public void addMessage(String message) {
        this.message += message + " ";
    }

    public String getMessage() {
        return message;
    }

}
