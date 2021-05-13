package com.example.jpaexamen.infrastructure.repository;

import com.example.jpaexamen.domain.EstudianteInputDto;

import java.io.IOException;

public interface ServicePut {
    Object updateUser(String id, EstudianteInputDto dtoUser) throws IOException;
}
