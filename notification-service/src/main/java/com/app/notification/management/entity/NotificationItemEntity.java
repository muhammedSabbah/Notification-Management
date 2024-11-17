package com.app.notification.management.entity;

import com.app.notification.management.enums.Channel;
import com.app.notification.management.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "notification_item")
@NoArgsConstructor
@AllArgsConstructor
public class NotificationItemEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Enumerated(EnumType.STRING)
    @Column(name = "channel")
    private Channel channel;
    @Column(name = "retry_count")
    private int retryCount;
    @Column(name = "status")
    private Status status;
    @Column(name = "error_message")
    private String errorMessage;
    @Column(name = "sent_time")
    private LocalDateTime sentTime;
    @Column(name = "received_time")
    private LocalDateTime receivedTime;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notification_id")
    private NotificationEntity notification;
}
