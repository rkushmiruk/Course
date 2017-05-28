package com.romankushmiruk.gof.blinnov.structural.bridge.bridgelogger;

public class SocketLogger extends Logger {
    public SocketLogger() {
    }

    public SocketLogger(LoggerImplementor logger) {
        super(logger);
    }

    public void log() {
        logger.logToSocket();
    }
}
