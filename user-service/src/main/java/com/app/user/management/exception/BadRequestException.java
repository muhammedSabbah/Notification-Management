package com.app.user.management.exception;

public class BadRequestException extends RuntimeException {
    protected AbstractGenericError error;
    protected Object errorData;
    protected BadRequestException(AbstractGenericError error, Object errorData) {
        super(error.getErrorCode().concat(" : ").concat(error.getErrorCode()).concat(" : ").concat(errorData == null ? "NO ERROR DATA" : errorData.toString()));
        this.error = error;
        this.errorData = errorData;
    }
}
