package com.romankushmiruk.gof.blinnov.behavioral.state;

public class TCPOpenState implements TCPState {
    @Override
    public void open(TCPConnection context) {
        System.out.println("State Open: Opening");
    }

    @Override
    public void close(TCPConnection context) {
        System.out.println("State Open: Closing");
    }

    @Override
    public void synchronize(TCPConnection context) {
        System.out.println("State Open: Synchronizing");
    }
}
