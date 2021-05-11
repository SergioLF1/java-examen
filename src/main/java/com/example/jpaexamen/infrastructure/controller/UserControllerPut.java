package com.example.jpaexamen.infrastructure.controller;

import com.example.jpaexamen.domain.DTOUser;
import com.example.jpaexamen.domain.EstudianteInputDto;
import com.example.jpaexamen.domain.User;
import com.example.jpaexamen.infrastructure.repository.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/edit"})
public class UserControllerPut {
    @Autowired
    UserPort userPort;

    //Edit
    @PutMapping(value = "/{id}")
    public ResponseEntity<EstudianteInputDto> updateUser(@PathVariable("id") String id, @RequestBody EstudianteInputDto dtoUser, HttpServletResponse response) throws IOException {
        Optional<User> userData = userPort.findById(id);
        if (userData.isPresent()) {
            User user = userData.get();
            user=new User(dtoUser);
            userPort.save(user);
            return new ResponseEntity<>(dtoUser, HttpStatus.OK);
        } else {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "No existe el registro");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
