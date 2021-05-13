package com.example.jpaexamen.Estudiante.infrastructure.controller;

import com.example.jpaexamen.Estudiante.infrastructure.controller.DTO.EstudianteOutputDto;
import com.example.jpaexamen.Estudiante.infrastructure.repository.ServiceGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/get"})
public class UserControllerGet {
    @Autowired
    ServiceGet serviceGet;

    //Get All
    @GetMapping
    public List<EstudianteOutputDto> getAllContacts() {
        return serviceGet.getAllContacts();
    }

    //Get by Id
    @GetMapping("/{id}")
    public EstudianteOutputDto getOneDto(@PathVariable String id) throws Exception {
            return serviceGet.getOneDto(id);
    }


}
