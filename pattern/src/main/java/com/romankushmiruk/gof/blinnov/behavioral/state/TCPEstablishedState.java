package com.romankushmiruk.gof.blinnov.behavioral.state;

public class TCPEstablishedState implements TCPState {
    @Override
    public void open(TCPConnection context) {
        System.out.println("State Established: Opening");
    }

    @Override
    public void close(TCPConnection context) {
        System.out.println("State Established: Closing");
    }

    @Override
    public void synchronize(TCPConnection context) {
        System.out.println("State Established: Synchronizing");
    }
}
