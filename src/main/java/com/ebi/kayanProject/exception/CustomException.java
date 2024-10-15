package com.ebi.kayanProject.exception;

public class CustomException extends RuntimeException {
    private final String redirectUrl;

    public CustomException(String message, String redirectUrl) {
        super(message);
        this.redirectUrl = redirectUrl;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }
}

