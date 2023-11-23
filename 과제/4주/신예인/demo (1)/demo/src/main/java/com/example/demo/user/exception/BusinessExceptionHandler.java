package com.example.demo.user.exception;

import lombok.Getter;

public class BusinessExceptionHandler extends RuntimeException{
    @Getter
    private final ErrorCode errorCode;

    public BusinessExceptionHandler(ErrorCode errorCode){
        super(errorCode.getMassage());
        this.errorCode=errorCode;
    }
}
