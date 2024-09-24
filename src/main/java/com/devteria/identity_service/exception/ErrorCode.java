package com.devteria.identity_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION("Uncategorized Error", 9999, HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY("Invalid message key",1001,HttpStatus.BAD_REQUEST),
    USER_EXISTED("User existed",1002,HttpStatus.BAD_REQUEST),
    USERNAME_INVALID("Username must be at least {min} characters",1003,HttpStatus.BAD_REQUEST),
    PASSWORD_INVALID("Password must be at least {min} characters",1004,HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED("User not existed",1005, HttpStatus.NOT_FOUND),
    UNAUTHENTICATED("Unauthenticated",1006, HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED("You do not have permission",1007, HttpStatus.FORBIDDEN),
    INVALID_DOB("your age must be at least {min}",1008, HttpStatus.BAD_REQUEST);


    ErrorCode(String message, int code, HttpStatusCode statusCode) {
        this.message = message;
        this.code = code;
        this.statusCode = statusCode;
    }

    private int code;
    private String message;
    private HttpStatusCode statusCode;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatusCode getStatusCode() {
        return statusCode;
    }
}
