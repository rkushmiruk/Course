package com.romankushmiruk.gof.blinnov.behavioral.mediator;

public interface PhoneOperatorMediator {
    long generatePhoneNumber();

    void addPhoneSubscriber(PhoneSubscriber ps);

    boolean isSupported(PhoneSubscriber ps);

    boolean connect(PhoneSubscriber ps1, PhoneSubscriber ps2);

    boolean disconnect(PhoneSubscriber ps);
}
