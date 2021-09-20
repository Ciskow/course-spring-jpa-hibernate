package com.ciskow.coursespringjpahibernate.repositories;

import com.ciskow.coursespringjpahibernate.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
