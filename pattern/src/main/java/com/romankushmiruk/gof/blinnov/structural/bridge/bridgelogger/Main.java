package com.romankushmiruk.gof.blinnov.structural.bridge.bridgelogger;

public class Main {
    public static void main(String[] args) {
        LoggerImplementor loggerImpl = new SingleThreadedLogger();
        Logger logger = new ConsoleLogger(loggerImpl);
        logger.log();
        loggerImpl = new MultiThreadedLogger();
        logger.setLogger(loggerImpl);
        logger.log();
        new FileLogger(loggerImpl).log();
    }
}
