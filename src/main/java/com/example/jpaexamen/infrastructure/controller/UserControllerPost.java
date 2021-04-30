package com.example.jpaexamen.infrastructure.controller;

import com.example.jpaexamen.domain.DTOUser;
import com.example.jpaexamen.domain.User;
import com.example.jpaexamen.infrastructure.repository.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/user"})
public class UserControllerPost {
    @Autowired
    UserPort userPort;

    //Add
    @PostMapping("/add")
    public User agregar(@RequestBody DTOUser dtoUser) {
        User user = new User(dtoUser);
        return userPort.save(user);
    }

}
