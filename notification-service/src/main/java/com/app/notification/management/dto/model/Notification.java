package com.app.notification.management.dto.model;

import com.app.notification.management.enums.Channel;
import com.app.notification.management.enums.Type;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    private String userId;
    private Set<Channel> channels;
    private Type type;
    private Message message;
    private LocalDateTime scheduledTime;
    private MetaData metaData;
    private Map<String, Object> properties;
}
