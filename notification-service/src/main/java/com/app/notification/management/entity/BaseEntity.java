package com.app.notification.management.entity;

import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
