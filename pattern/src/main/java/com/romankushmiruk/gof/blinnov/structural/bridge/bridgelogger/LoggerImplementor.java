package com.romankushmiruk.gof.blinnov.structural.bridge.bridgelogger;

public interface LoggerImplementor {
    void logToConsole();

    void logToFile();

    void logToSocket();
}
