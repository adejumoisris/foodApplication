package com.example.foodApplication.email_notification.service;

import com.example.foodApplication.email_notification.dtos.NotificationDTO;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO);
}
