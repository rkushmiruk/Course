package com.romankushmiruk.gof.blinnov.creational.builder;

public abstract class BaseBuilder {
    protected User user;

    public User getUser(){
        return user;
    }

    public abstract void buildLogin();
    public abstract void buildPassword();

}
