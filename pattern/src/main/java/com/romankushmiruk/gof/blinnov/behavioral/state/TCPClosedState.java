package com.romankushmiruk.gof.blinnov.behavioral.state;

public class TCPClosedState implements TCPState {
    @Override
    public void open(TCPConnection context) {
        System.out.println("State Closed: Opening");
    }

    @Override
    public void close(TCPConnection context) {
        System.out.println("State Closed: Closing");
    }

    @Override
    public void synchronize(TCPConnection context) {
        System.out.println("State Closed: Synchronizing");
    }
}
