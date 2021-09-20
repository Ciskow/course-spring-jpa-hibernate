package com.ciskow.coursespringjpahibernate.repositories;

import com.ciskow.coursespringjpahibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
