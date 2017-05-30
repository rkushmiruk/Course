package com.romankushmiruk.controller;

import com.romankushmiruk.model.Reflection;
import com.romankushmiruk.util.GlobalConstants;
import com.romankushmiruk.view.View;

public class Controller {
    private Reflection reflection;

    public Controller(Reflection reflection) {
        this.reflection = reflection;
    }

    public void processUser(){
        View.printMessage(GlobalConstants.CLASS_NAME);
        View.printMessage(reflection.getSimpleName());

        View.printMessage(GlobalConstants.CLASS_MODIFIERS);
        View.printMessage(reflection.getModifier().toString());

        View.printMessage(GlobalConstants.CLASS_CONSTRUCTORS);
        View.printArray(reflection.getConstructors());

        View.printMessage(GlobalConstants.CLASS_METHODS);
        View.printArray(reflection.getMethods());

        View.printMessage(GlobalConstants.METHODS_ANNOTATIONS);
        View.printTwoDimensionalArray(reflection.getAnnotations());

        View.printMessage(GlobalConstants.SUPERCLASS);
        View.printMessage(reflection.getSuperClass().toString());

        View.printMessage(GlobalConstants.CLASS_FIELDS);
        View.printArray(reflection.getFields());

        View.printMessage(GlobalConstants.CLASS_INTERFACES);
        View.printArray(reflection.getInterfaces());
    }
}
