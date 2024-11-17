package com.app.notification.management.entity;

import com.app.notification.management.enums.Priority;
import com.app.notification.management.enums.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "notification")
@NoArgsConstructor
@AllArgsConstructor
public class NotificationEntity extends BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "message_subject")
    private String messageSubject;
    @Column(name = "message_body")
    private String messageBody;
    @Column(name = "recipient_id")
    private String recipientId;
    @Column(name = "recipient_email")
    private String recipientEmail;
    @Column(name = "type")
    private Type type;
    @Column(name = "scheduled_time")
    private LocalDateTime scheduledTime;
    @Column(name = "priority")
    private Priority priority;
    @OneToMany(mappedBy = "notification", fetch = FetchType.LAZY)
    private List<NotificationItemEntity> notificationItems;
    @OneToMany(mappedBy = "notification", fetch = FetchType.LAZY)
    private List<NotificationAttachmentEntity> notificationAttachments;
}
