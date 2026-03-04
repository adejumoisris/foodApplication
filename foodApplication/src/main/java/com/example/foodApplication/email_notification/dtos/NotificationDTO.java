package com.example.foodApplication.email_notification.dtos;

import com.example.foodApplication.enums.NotificationType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationDTO {


    private Long id;

    private String subject;
    @NotBlank(message = "recipeint is required")
    private String recipient;
    private String body;

    private NotificationType type;

    private  LocalDateTime createdAt;

    private boolean isHtml;
}
