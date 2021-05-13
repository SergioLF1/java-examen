package com.example.jpaexamen.Estudiante.infrastructure.repository;

import com.example.jpaexamen.Estudiante.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPort extends JpaRepository<User, String> {

   
}
