package com.example.jpaexamen.infrastructure.repository;

import com.example.jpaexamen.infrastructure.controller.DTO.EstudianteInputDto;
import com.example.jpaexamen.domain.User;

public interface ServicePost {

     User agregar(EstudianteInputDto dtoUser);
}
