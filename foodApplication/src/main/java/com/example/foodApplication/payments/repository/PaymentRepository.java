package com.example.foodApplication.payments.repository;

import com.example.foodApplication.payments.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
