package com.vti.entity;

import java.time.LocalDateTime;

public class MyException extends Exception {
    private String message;
    private String reason;
    private StackTraceElement[] stackTrace;
    private LocalDateTime time;

    public MyException(String message, String reason, Throwable cause) {
        super(message, cause);
        this.message = message;
        this.reason = reason;
        this.stackTrace = cause.getStackTrace();
        this.time = LocalDateTime.now();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        return stackTrace;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
