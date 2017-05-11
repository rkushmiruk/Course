package com.romankushmiruk.model;

/**
 * Created by roman on 11.05.17.
 */
public class Model {
    private String message = "";

    public void addMessage(String message) {
        this.message += message + " ";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
