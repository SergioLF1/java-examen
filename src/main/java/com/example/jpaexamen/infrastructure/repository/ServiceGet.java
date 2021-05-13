package com.example.jpaexamen.infrastructure.repository;

import com.example.jpaexamen.domain.EstudianteOutputDto;

import java.util.List;

public interface ServiceGet {
    List<EstudianteOutputDto> getAllContacts();

    EstudianteOutputDto getOneDto(String id) throws Exception;
}
