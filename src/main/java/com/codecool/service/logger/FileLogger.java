package com.codecool.service.logger;

public class FileLogger extends LoggerBase implements Logger {
    @Override
    public void logInfo(String message) {
        System.out.println(createLogEntry(message, "INFO"));
    }

    @Override
    public void logError(String message) {
        System.out.println(createLogEntry(message, "ERROR"));
    }
}
