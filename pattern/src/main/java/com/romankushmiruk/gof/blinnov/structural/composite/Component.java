package com.romankushmiruk.gof.blinnov.structural.composite;

public interface Component {
    void send();

    void receive();

    int countChannels();
}
