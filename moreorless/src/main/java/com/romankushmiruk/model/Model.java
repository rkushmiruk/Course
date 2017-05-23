package com.romankushmiruk.model;

import com.romankushmiruk.util.GlobalConstants;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Model {
    private Integer minValue;
    private Integer maxValue;
    private Integer secretNumber;
    private List<Integer> userNumbers = new ArrayList<>();

    public boolean checkNumber(Integer number) {
        Objects.requireNonNull(number);
        if (number > secretNumber) {
            setMaxValue(number);
        }
        if (number < secretNumber) {
            setMinValue(number);
        }
        userNumbers.add(number);
        return number == secretNumber;
    }

    public Integer rand(Integer min, Integer max) {
        Objects.requireNonNull(min);
        Objects.requireNonNull(max);

        setRange(min, max);
        Random r = new Random();
        return r.nextInt(GlobalConstants.RAND_MAX);
    }

    public int rand() {
        return rand(0, GlobalConstants.RAND_MAX);
    }

    private void setRange(Integer minValue, Integer maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    public void setSecretNumber(Integer secretNumber) {
        this.secretNumber = secretNumber;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }


}
