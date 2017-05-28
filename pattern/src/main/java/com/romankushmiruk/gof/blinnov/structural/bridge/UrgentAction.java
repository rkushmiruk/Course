package com.romankushmiruk.gof.blinnov.structural.bridge;

public class UrgentAction extends Action {
    private final static int MONTHLY_PAYMENT = 10; // read from base
    private final static int MAX_SUM = 50; // read from base

    @Override
    public double chargeInterest() {
        return 0;//stub
    }

    @Override
    public double defineMaxSum() {
        // check credit
        // max sum is bounded"
        return MAX_SUM;
    }

    @Override
    public double increasePayment() {
        // MAX increase in monthly payments
        return MONTHLY_PAYMENT;
    }
}
