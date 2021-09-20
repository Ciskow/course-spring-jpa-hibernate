package com.ciskow.coursespringjpahibernate.repositories;

import com.ciskow.coursespringjpahibernate.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
