package com.app.notification.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "notification")
@NoArgsConstructor
public class NotificationEntity extends BaseEntity {
    @Id
    private Long id;
}
