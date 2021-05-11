package com.example.jpaexamen.infrastructure.repository;

import com.example.jpaexamen.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    //List<User> getData(HashMap<String, Object> conditions);
}
