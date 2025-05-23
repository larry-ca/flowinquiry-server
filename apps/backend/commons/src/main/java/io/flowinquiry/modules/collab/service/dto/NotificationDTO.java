package io.flowinquiry.modules.collab.service.dto;

import io.flowinquiry.modules.collab.domain.NotificationType;
import java.time.Instant;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationDTO {
    private Long id;
    private NotificationType type;
    private String content;
    private Long userId;
    private Boolean isRead;
    private Instant createdAt;
}
