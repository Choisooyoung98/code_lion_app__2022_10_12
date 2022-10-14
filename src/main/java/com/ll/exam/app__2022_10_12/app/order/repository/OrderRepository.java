package com.ll.exam.app__2022_10_12.app.order.repository;

import com.ll.exam.app__2022_10_12.app.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
