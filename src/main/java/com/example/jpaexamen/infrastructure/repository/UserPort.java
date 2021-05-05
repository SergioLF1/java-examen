package com.example.jpaexamen.infrastructure.repository;

import com.example.jpaexamen.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPort extends JpaRepository<User, String> {

   
}
