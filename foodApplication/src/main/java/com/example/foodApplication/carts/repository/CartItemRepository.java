package com.example.foodApplication.carts.repository;

import com.example.foodApplication.carts.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
