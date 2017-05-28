package com.romankushmiruk.gof.blinnov.structural.bridge.bridgelogger;

public abstract class Logger {
    protected LoggerImplementor logger;

    public Logger() {

    }

    public Logger(LoggerImplementor logger) {
        this.logger = logger;
    }

    public void setLogger(LoggerImplementor logger) {
        this.logger = logger;
    }

    public abstract void log();

}
