package com.example.jpaexamen.infrastructure.services;

import com.example.jpaexamen.domain.EstudianteInputDto;
import com.example.jpaexamen.domain.User;
import com.example.jpaexamen.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class ImServicePost {
    @Autowired
    UserRepository userRepository;
    public User agregar(@RequestBody EstudianteInputDto dtoUser) {
        User user = new User(dtoUser);
        return userRepository.save(user);
    }
}
