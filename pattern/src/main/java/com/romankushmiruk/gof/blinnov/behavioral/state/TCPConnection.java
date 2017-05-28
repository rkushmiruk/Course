package com.romankushmiruk.gof.blinnov.behavioral.state;

public class TCPConnection {
    private TCPState state;

    public TCPConnection() {
        state = new TCPClosedState();
    }

    public void open() {
        state.open(this);
        this.changeState(new TCPOpenState());
    }

    public void close() {
        state.close(this);
        this.changeState(new TCPClosedState());
    }

    public void synchronize() {
        state.synchronize(this);
        this.changeState(new TCPEstablishedState());
    }

    private void changeState(TCPState state) {
        // проверка на возможность изменения состояния
        this.state = state;
    }
}
