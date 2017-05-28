package com.romankushmiruk.gof.blinnov.behavioral.visitor;

public interface Visitor {
    void visit(DVDRenting service);
    void visit(ApplianceRenting service);
}
