package com.app.notification.management.dto.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private String subject;
    private String body;
    private List<Attachment> attachments;
}
