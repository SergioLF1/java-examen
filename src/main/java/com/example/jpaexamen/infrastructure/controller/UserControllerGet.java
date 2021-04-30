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
@RequestMapping({"/get"})
public class UserControllerGet {
    @Autowired
    UserPort userPort;

    //Get All
    @GetMapping
    public List<DTOUser> getAllContacts() {
        List<User> list = userPort.findAll();
        List<DTOUser> list1 = new ArrayList<DTOUser>();
        DTOUser dtoUser;
        for (User user : list) {
            dtoUser = new DTOUser(user);
            list1.add(dtoUser);
        }
        return list1;
    }

    //Get by Id
    @GetMapping("/{id}")
    public DTOUser getOneDto(@PathVariable String id) throws Exception {
        User user = userPort.findById(id).orElseThrow(() -> new Exception("Not found"));
        DTOUser dtoUser = new DTOUser(user);
        return dtoUser;
    }

}
