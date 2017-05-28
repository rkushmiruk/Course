package com.romankushmiruk.gof.blinnov.structural.bridge.bridgelogger;

public class FileLogger extends Logger {
    public FileLogger() {
    }

    public FileLogger(LoggerImplementor logger) {
        super(logger);
    }

    public void log() {
        logger.logToFile();
    }
}
