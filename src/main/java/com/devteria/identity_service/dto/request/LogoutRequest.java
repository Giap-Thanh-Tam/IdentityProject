package com.devteria.identity_service.dto.request;

public class LogoutRequest {
    private String token;


    public LogoutRequest() {

    }

    public LogoutRequest(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
