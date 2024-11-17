package com.app.notification.management.dto.model;

import com.app.notification.management.enums.Priority;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class MetaData {
    private Priority priority;
    private int retryCount;
}
