package com.devteria.identity_service.dto.request;

public class IntrospectRequest {
    private String token;


    public IntrospectRequest() {

    }

    public IntrospectRequest(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
