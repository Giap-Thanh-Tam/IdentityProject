package com.devteria.identity_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION("Uncategorized Error", 9999),
    INVALID_KEY("Invalid message key",1001),
    USER_EXISTED("User existed",1002),
    USERNAME_INVALID("Username must be at least 3 characters",1003),
    PASSWORD_INVALID("Password must be at least 3 characters",1004),
    USER_NOT_EXISTED("User not existed",1005),
    UNAUTHENTICATED("Unanthenticated",1006);
    ErrorCode(String message, int code) {
        this.message = message;
        this.code = code;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
