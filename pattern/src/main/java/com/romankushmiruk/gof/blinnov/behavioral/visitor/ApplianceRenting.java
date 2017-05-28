package com.romankushmiruk.gof.blinnov.behavioral.visitor;

public class ApplianceRenting extends Renting {
    private double redemptionPrice;

    public double getRedemptionPrice() {
        return redemptionPrice;
    }

    public void setRedemptionPrice(double redemptionPrice) {
        this.redemptionPrice = redemptionPrice;
    }

    @Override
    public void accept(Visitor v) {

    }
}
