package com.microsservicecourse.orderservice.repository;

import com.microsservicecourse.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
