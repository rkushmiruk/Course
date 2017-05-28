package com.romankushmiruk.gof.blinnov.behavioral.state;

public interface TCPState {
    void open(TCPConnection context);

    void close(TCPConnection context);

    void synchronize(TCPConnection context);
}
