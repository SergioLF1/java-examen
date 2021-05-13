package com.example.jpaexamen.Estudiante.infrastructure.repository;

import com.example.jpaexamen.Estudiante.infrastructure.controller.DTO.EstudianteOutputDto;

import java.util.List;

public interface ServiceGet {
    List<EstudianteOutputDto> getAllContacts();

    EstudianteOutputDto getOneDto(String id) throws Exception;
}
