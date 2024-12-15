package com.app.notification.management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "attachment")
@NoArgsConstructor
@AllArgsConstructor
public class NotificationAttachmentEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "url")
    private String url;
    @Column(name = "type")
    private String type;
    @Column(name = "file_name")
    private String fileName;
    @Column(name = "mime_type")
    private String mimeType;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notification_id")
    private NotificationEntity notification;
}
