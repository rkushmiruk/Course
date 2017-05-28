package com.romankushmiruk.gof.blinnov.behavioral.visitor;

public class StandartVisitor implements Visitor {
    @Override
    public void visit(DVDRenting service) {
        System.out.println("Standard DVD renting service");
    }

    @Override
    public void visit(ApplianceRenting service) {
        System.out.println("Standard Appliance renting service");
    }
}
