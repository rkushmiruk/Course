package com.romankushmiruk.controller;

import com.romankushmiruk.model.Reflection;
import com.romankushmiruk.view.View;

public class Controller {
    private Reflection reflection;

    public Controller(Reflection reflection) {
        this.reflection = reflection;
    }

    public void processUser(){
        View.printMessage("Class Name: ");
        View.printMessage(reflection.getSimpleName());

        View.printMessage("Class modifiers: ");
        View.printMessage(reflection.getModifier().toString());

        View.printMessage("Class constructors: ");
        View.printArray(reflection.getConstructors());

        View.printMessage("Class methods: ");
        View.printArray(reflection.getMethods());

        View.printMessage("Class method annotation:");
        View.printNArray(reflection.getAnnotations());
    }
}
