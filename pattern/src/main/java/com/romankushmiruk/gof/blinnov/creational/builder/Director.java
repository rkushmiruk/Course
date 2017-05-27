package com.romankushmiruk.gof.blinnov.creational.builder;

public class Director {
    public static User createUser(BaseBuilder builder){
        builder.buildLogin();
        builder.buildPassword();
        return builder.getUser();
    }
}
