package com.app.notification.management.payload;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record AppResponse<T>(
        T payload,
        boolean success,
        Integer statusCode,
        Error error,
        LocalDateTime serviceTime,
        String requestId
) {
    public static <T> AppResponse<T> created(T payload) {
        return new AppResponse<>(payload, true, HttpStatus.CREATED.value(), null, LocalDateTime.now(), null);
    }
}
