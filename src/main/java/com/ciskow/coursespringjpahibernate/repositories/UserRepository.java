package com.ciskow.coursespringjpahibernate.repositories;

import com.ciskow.coursespringjpahibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
