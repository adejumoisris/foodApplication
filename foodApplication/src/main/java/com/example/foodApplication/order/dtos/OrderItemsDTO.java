package com.example.foodApplication.order.dtos;

import com.example.foodApplication.menu.dtos.MenuDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItemsDTO {
    private Long id;
    private int quantity;
    private Long  menuId;

    private MenuDTO menu;

    private BigDecimal pricePerUnit;
    private BigDecimal subtotal;
}
