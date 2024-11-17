package com.app.notification.management.controller;

import com.app.notification.management.dto.model.Notification;
import com.app.notification.management.dto.response.NotificationResponse;
import com.app.notification.management.payload.AppResponse;
import com.app.notification.management.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/notifications")
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;

    @PostMapping("")
    public ResponseEntity<AppResponse<NotificationResponse>> sendNotification(@RequestBody Notification notification) {
        NotificationResponse notificationResponse = notificationService.sendNotification(notification);
        return new ResponseEntity<>(AppResponse.created(notificationResponse), HttpStatus.CREATED);
    }
}
