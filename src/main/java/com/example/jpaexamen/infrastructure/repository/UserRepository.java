package com.example.jpaexamen.infrastructure.repository;

import com.example.jpaexamen.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    //List<User> getData(HashMap<String, Object> conditions);
    List<User> findAll();
}
