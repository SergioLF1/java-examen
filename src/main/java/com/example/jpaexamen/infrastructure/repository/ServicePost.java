package com.example.jpaexamen.infrastructure.repository;

import com.example.jpaexamen.domain.EstudianteInputDto;
import com.example.jpaexamen.domain.User;
import org.springframework.web.bind.annotation.RequestBody;

public interface ServicePost {

    public User agregar(@RequestBody EstudianteInputDto dtoUser);
}
