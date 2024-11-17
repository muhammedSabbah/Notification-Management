package com.app.notification.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "notification")
@NoArgsConstructor
@RequiredArgsConstructor
public class NotificationEntity extends BaseEntity {
    @Id
    private Long id;
}
