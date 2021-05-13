package com.example.jpaexamen.infrastructure.controller;

import com.example.jpaexamen.domain.EstudianteInputDto;
import com.example.jpaexamen.infrastructure.repository.ServicePut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/edit"})
public class UserControllerPut {
    @Autowired
    ServicePut servicePut;

    //Edit
    @PutMapping(value = "/{id}")
    public Object updateUser(@PathVariable("id") String id, @RequestBody EstudianteInputDto dtoUser) throws IOException {
        return servicePut.updateUser(id, dtoUser);
    }

}
