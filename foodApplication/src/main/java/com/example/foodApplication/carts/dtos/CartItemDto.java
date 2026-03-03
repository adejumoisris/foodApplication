package com.example.foodApplication.carts.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CartItemDto {

    private Long id;
    private MenuDto menu;
    private int quantity;
    private BigDecimal totalAmount;
    private BigDecimal subTotal;
}
