package com.example.jpaexamen.infrastructure.controller;

import com.example.jpaexamen.domain.User;
import com.example.jpaexamen.infrastructure.repository.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/delete"})
public class UserControllerDelete {
    @Autowired
    UserPort userPort;

    //Delete by Id
    @DeleteMapping(value = "/{id}")
    public void borrarUsuarioById(@PathVariable String id, HttpServletResponse response) throws IOException {
        Optional<User> user = userPort.findById(id);
        if (user.isPresent()) {
            userPort.deleteById(id);
        } else {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "No existe el registro");
        }
    }

}
