package com.example.jpaexamen.Estudiante.infrastructure.services;

import com.example.jpaexamen.Estudiante.infrastructure.controller.DTO.EstudianteInputDto;
import com.example.jpaexamen.Estudiante.domain.User;
import com.example.jpaexamen.Estudiante.infrastructure.repository.ServicePost;
import com.example.jpaexamen.Estudiante.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class ImServicePost implements ServicePost {
    @Autowired
    UserRepository userRepository;

    public User agregar(@RequestBody EstudianteInputDto dtoUser) {
        User user = new User(dtoUser);
        return userRepository.save(user);
    }
}
