package com.example.foodApplication.order.repository;

import com.example.foodApplication.auth_users.entity.Users;
import com.example.foodApplication.enums.OrderStatus;
import com.example.foodApplication.order.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Page<Order> findByOrderStatus(OrderStatus orderStatus, Pageable pageable);

    List<Order> findByUserOrderByOrderDateDesc(Users users);
    @Query("SELECT COUNT (DISTINCT o.user.id) FROM Order o")
    long countDistinctUsers();
}
