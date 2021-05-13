package com.example.jpaexamen.Estudiante.infrastructure.controller;

import com.example.jpaexamen.Estudiante.infrastructure.controller.DTO.EstudianteInputDto;
import com.example.jpaexamen.Estudiante.domain.User;
import com.example.jpaexamen.Estudiante.infrastructure.repository.ServicePost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/add"})
public class UserControllerPost {
    @Autowired
    ServicePost servicePost;

    //Add
    @PostMapping
    public User agregar(@RequestBody EstudianteInputDto user) {
        return servicePost.agregar(user);
    }

}
