package com.example.jpaexamen.Estudiante.infrastructure.repository;

import com.example.jpaexamen.Estudiante.infrastructure.controller.DTO.EstudianteInputDto;

import java.io.IOException;

public interface ServicePut {
    Object updateUser(String id, EstudianteInputDto dtoUser) throws IOException;
}
