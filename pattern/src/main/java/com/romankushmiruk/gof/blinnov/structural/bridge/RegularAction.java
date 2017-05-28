package com.romankushmiruk.gof.blinnov.structural.bridge;

public class RegularAction extends Action {

    private final static int MAX_SUM = 100; // read from base
    private final static int NORMAL_INTEREST = 3; // read from base

    @Override
    public double chargeInterest() {
        return NORMAL_INTEREST;
    }

    @Override
    public double defineMaxSum() {
        return MAX_SUM;
    }

    @Override
    public double increasePayment() {
        return 0;//stub
    }
}
