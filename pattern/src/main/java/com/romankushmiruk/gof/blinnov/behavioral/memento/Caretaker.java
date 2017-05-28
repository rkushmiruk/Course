package com.romankushmiruk.gof.blinnov.behavioral.memento;

public class Caretaker {
    private Memento memento;

    public Caretaker(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
