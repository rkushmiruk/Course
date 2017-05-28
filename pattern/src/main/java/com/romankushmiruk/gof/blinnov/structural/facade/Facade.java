package com.romankushmiruk.gof.blinnov.structural.facade;

public class Facade implements IFacade {
    private SecuritySystem securitySystem;
    private SubSystem subSystem;

    public Facade() {
        // варианты инициализации могут быть разными
        this.subSystem = new SubSystem();
        this.securitySystem = new SecuritySystem();
    }

    @Override
    public void generate() {
        // проверка пользователя и его прав
        securitySystem.checkUser();
        securitySystem.checkRights(); // действие
        subSystem.createNode();
    }

    @Override
    public void find() {
        // проверка пользователя
        securitySystem.checkUser();
        // действие parse
        subSystem.parse();
    }
}
