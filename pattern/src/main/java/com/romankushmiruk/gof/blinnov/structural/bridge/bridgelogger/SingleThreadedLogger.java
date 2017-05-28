package com.romankushmiruk.gof.blinnov.structural.bridge.bridgelogger;

public class SingleThreadedLogger implements LoggerImplementor {
    @Override
    public void logToConsole() {
        System.out.println("SingleThreadedLogger console log");
    }

    @Override
    public void logToFile() {
        System.out.println("SingleThreadedLogger file log");
    }

    @Override
    public void logToSocket() {
        System.out.println("SingleThreadedLogger socket log");
    }
}
