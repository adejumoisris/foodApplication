package com.example.foodApplication.order.dtos;

import com.example.foodApplication.auth_users.dtos.UserDto;
import com.example.foodApplication.enums.OrderStatus;
import com.example.foodApplication.enums.PaymentStatus;
import com.example.foodApplication.menu.entity.Menu;
import com.example.foodApplication.order.entity.Order;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDto {

    private Long id;
    private LocalDateTime orderDate;
    private BigDecimal totalAmount;

    private OrderStatus orderStatus;

    private PaymentStatus  paymentStatus;

    private UserDto user;

    private List<OrderItemsDTO> orderItems;
}
