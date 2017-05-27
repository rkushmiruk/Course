package com.romankushmiruk.gof.blinnov.behavioral.iterator;

public interface CustomIterator {
    void first();

    void next();

    boolean isDone();

    Object currentItem();
}
