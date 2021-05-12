package com.example.jpaexamen.infrastructure.repository;

import com.example.jpaexamen.domain.EstudianteInputDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ServicePut {
    public ResponseEntity updateUser(@PathVariable("id") String id, @RequestBody EstudianteInputDto dtoUser, HttpServletResponse response) throws IOException;
}
