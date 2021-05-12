package com.example.jpaexamen.infrastructure.repository;

import com.example.jpaexamen.domain.EstudianteInputDto;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ServicePut {
    ResponseEntity updateUser(String id, EstudianteInputDto dtoUser, HttpServletResponse response) throws IOException;
}
