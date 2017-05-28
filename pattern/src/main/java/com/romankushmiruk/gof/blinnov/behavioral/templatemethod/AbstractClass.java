package com.romankushmiruk.gof.blinnov.behavioral.templatemethod;

public abstract class AbstractClass {
    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }
}
