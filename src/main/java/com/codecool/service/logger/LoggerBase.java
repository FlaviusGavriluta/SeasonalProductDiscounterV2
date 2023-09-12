package com.codecool.service.logger;

import java.time.LocalDateTime;

public abstract class LoggerBase {
    protected String createLogEntry(String message, String type) {
        return String.format("[%s] %s: %s", LocalDateTime.now(), type, message);
    }
}