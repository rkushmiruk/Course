package com.romankushmiruk.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roman on 12.05.17.
 */
public class Model {
    private int number;
    private List<Integer> userNumbers = new ArrayList<>();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

}
