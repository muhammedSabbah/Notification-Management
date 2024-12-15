package com.app.notification.management.dto.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Attachment {
    private String url;
    private String type;
    private String fileName;
    private String mimeType;
}
