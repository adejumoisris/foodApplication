package com.example.foodApplication.order.repository;

import com.example.foodApplication.order.entity.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderItemsRepository extends JpaRepository<OrderItems, Long> {
    @Query("SELECT CASE  WHEN  COUNT (oi)> 0 THEN TRUE  ELSE FALSE END " +
            "FROM  OrderItems oi " + "where oi.order.id = :orderId AND oi.menu.id = :menuId ")
    boolean existsByOrderIdAndMenuId(
            @Param("orderId") Long orderId,
            @Param("menuId") Long menuId);
}
