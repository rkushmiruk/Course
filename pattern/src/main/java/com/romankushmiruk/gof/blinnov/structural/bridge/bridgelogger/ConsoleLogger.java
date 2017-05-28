package com.romankushmiruk.gof.blinnov.structural.bridge.bridgelogger;

public class ConsoleLogger extends Logger {
    public ConsoleLogger() {
    }

    public ConsoleLogger(LoggerImplementor logger) {
        super(logger);
    }

    public void log() {
        logger.logToConsole();
    }
}
