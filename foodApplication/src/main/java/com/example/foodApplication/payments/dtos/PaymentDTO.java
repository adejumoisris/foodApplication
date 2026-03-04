package com.example.foodApplication.payments.dtos;

import com.example.foodApplication.auth_users.dtos.UserDto;
import com.example.foodApplication.auth_users.entity.Users;
import com.example.foodApplication.enums.PaymentGateway;
import com.example.foodApplication.enums.PaymentStatus;
import com.example.foodApplication.order.dtos.OrderDto;
import com.example.foodApplication.order.entity.Order;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentDTO {


    private Long id;

    private Long orderId;

    private BigDecimal amount;

    private PaymentStatus paymentStatus;

    private String transactionId;

    private PaymentGateway paymentGateway;

    private boolean success;
    private LocalDateTime paymentDate;
    private OrderDto order;
    private UserDto user;

}
