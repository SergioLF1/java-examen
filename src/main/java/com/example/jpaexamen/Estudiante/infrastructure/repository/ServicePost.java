package com.example.jpaexamen.Estudiante.infrastructure.repository;

import com.example.jpaexamen.Estudiante.infrastructure.controller.DTO.EstudianteInputDto;
import com.example.jpaexamen.Estudiante.domain.User;

public interface ServicePost {

     User agregar(EstudianteInputDto dtoUser);
}
