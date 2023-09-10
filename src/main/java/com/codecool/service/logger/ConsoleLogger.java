package com.codecool.service.logger;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger {
    @Override
    public void logInfo(String message) {
        System.out.println(createLogEntry(message, "INFO"));
    }

    @Override
    public void logError(String message) {
        System.out.println(createLogEntry(message, "ERROR"));
    }

    private static String createLogEntry(String message, String type) {
        return String.format("[%s] %s: %s", LocalDateTime.now(), type, message);
    }
}