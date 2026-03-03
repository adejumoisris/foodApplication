package com.example.foodApplication.carts.repository;

import com.example.foodApplication.carts.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByUser_id(Long userId);
}
