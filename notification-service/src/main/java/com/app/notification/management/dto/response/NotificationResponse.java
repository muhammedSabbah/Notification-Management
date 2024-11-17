package com.app.notification.management.dto.response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
public class NotificationResponse {
    private UUID notificationId;
    private String status;
}
