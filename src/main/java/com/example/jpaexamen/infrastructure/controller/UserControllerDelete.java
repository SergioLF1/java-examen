package com.example.jpaexamen.infrastructure.controller;

import com.example.jpaexamen.infrastructure.repository.ServiceDelete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/delete"})
public class UserControllerDelete {
    @Autowired
    ServiceDelete serviceDelete;

    //Delete by Id
    @DeleteMapping(value = "/{id}")
    public void borrarUsuarioById(@PathVariable String id, HttpServletResponse response) throws IOException {
        serviceDelete.borrarUsuarioById(id, response);
    }

}
