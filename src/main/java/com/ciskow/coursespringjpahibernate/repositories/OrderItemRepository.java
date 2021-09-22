package com.ciskow.coursespringjpahibernate.repositories;

import com.ciskow.coursespringjpahibernate.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
