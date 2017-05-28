package com.romankushmiruk.gof.blinnov.behavioral.visitor;

public class PenaltyRateVisitor implements Visitor {
    @Override
    public void visit(DVDRenting service) {
        System.out.println("Penalty DVD renting service");
    }

    @Override
    public void visit(ApplianceRenting service) {
        System.out.println("Penalty Appliance renting service");
    }
}
