package com.example.objectexample.user.exception;

import lombok.Getter;

public class BusinessExceptionHandler extends RuntimeException{
    @Getter
    private final ErrorCode errorCode;

    public BusinessExceptionHandler(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
