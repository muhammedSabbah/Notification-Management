package com.app.user.management.exception.enumeration;

import com.app.user.management.exception.AbstractGenericError;

public enum GenericError implements AbstractGenericError {
    ;

    private final String businessCode;
    private final String errorCode;

    GenericError(String businessCode, String errorCode) {
        this.businessCode = businessCode;
        this.errorCode = errorCode;
    }
    @Override
    public String getBusinessCode() {
        return businessCode;
    }

    @Override
    public String getErrorCode() {
        return errorCode;
    }
}
