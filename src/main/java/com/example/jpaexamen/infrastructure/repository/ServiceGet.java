package com.example.jpaexamen.infrastructure.repository;

import com.example.jpaexamen.domain.EstudianteOutputDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ServiceGet {
     List<EstudianteOutputDto> getAllContacts();

     EstudianteOutputDto getOneDto(@PathVariable String id) throws Exception;
}
