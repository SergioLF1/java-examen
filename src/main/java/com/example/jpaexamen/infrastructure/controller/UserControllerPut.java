package com.example.jpaexamen.infrastructure.controller;

import com.example.jpaexamen.domain.DTOUser;
import com.example.jpaexamen.domain.User;
import com.example.jpaexamen.infrastructure.repository.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/edit"})
public class UserControllerPut {
    @Autowired
    UserPort userPort;

    //Edit
    @PutMapping(value = "/{id}")
    public ResponseEntity<DTOUser> updateUser(@PathVariable("id") String id, @RequestBody DTOUser dtoUser) {
        Optional<User> userData = userPort.findById(id);
        if (userData.isPresent()) {
            User user = userData.get();
            user=new User(dtoUser);
            userPort.save(user);
            return new ResponseEntity<>(dtoUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
