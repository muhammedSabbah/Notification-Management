package com.app.notification.management.service;

import com.app.notification.management.dto.model.Notification;
import com.app.notification.management.dto.response.NotificationResponse;

public interface NotificationService {
    NotificationResponse sendNotification(Notification notification);
}
