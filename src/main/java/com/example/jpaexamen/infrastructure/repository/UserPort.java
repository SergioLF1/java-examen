package com.example.jpaexamen.infrastructure.repository;

import com.example.jpaexamen.domain.DTOUser;
import com.example.jpaexamen.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserPort extends JpaRepository<User, String> {


}
