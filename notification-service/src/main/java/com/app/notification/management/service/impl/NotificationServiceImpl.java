package com.app.notification.management.service.impl;

import com.app.notification.management.dto.model.Notification;
import com.app.notification.management.dto.response.NotificationResponse;
import com.app.notification.management.repository.NotificationRepository;
import com.app.notification.management.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {
    private final NotificationRepository notificationRepository;

    @Override
    public NotificationResponse sendNotification(Notification notification) {
        return null;
    }
}
