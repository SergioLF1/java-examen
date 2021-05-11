package com.example.jpaexamen.infrastructure.controller;

import com.example.jpaexamen.domain.DTOUser;
import com.example.jpaexamen.domain.EstudianteInputDto;
import com.example.jpaexamen.domain.EstudianteOutputDto;
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
public class UserController {
    @Autowired
    UserPort userPort;

    //Get All
    @GetMapping("/get")
    public List<EstudianteOutputDto> getAllContacts() {
        List<User> list = userPort.findAll();
        List<EstudianteOutputDto> list1 = new ArrayList<EstudianteOutputDto>();
        EstudianteOutputDto dtoUser;
        for (User user : list) {
            dtoUser = new EstudianteOutputDto();
            list1.add(dtoUser);
        }
        return list1;
    }

    //Add
    @PostMapping("/add")
    public User agregar(@RequestBody EstudianteInputDto dtoUser) {
        User user = new User(dtoUser);
        return userPort.save(user);
    }

    //Get by Id
    @GetMapping("/get/{id}")
    public EstudianteOutputDto getOneDto(@PathVariable String id) throws Exception {
        User user = userPort.findById(id).orElseThrow(() -> new Exception("Not found"));
        EstudianteOutputDto dtoUser = new EstudianteOutputDto();
        return dtoUser;
    }

    //Delete
    @DeleteMapping(value = "/delete/{id}")
    public void borrarUsuarioById(@PathVariable String id) {
        Optional<User> c = userPort.findById(id);
        if (c.isPresent()) {
            userPort.deleteById(id);
        }
    }

    //Edit
    @PutMapping(value = "/edit/{id}")
    public ResponseEntity<EstudianteInputDto> updateUser(@PathVariable("id") String id, @RequestBody EstudianteInputDto dtoUser) {
        Optional<User> userData = userPort.findById(id);
        if (userData.isPresent()) {
            User user = userData.get();
            user = new User(dtoUser);
            userPort.save(user);
            return new ResponseEntity<>(dtoUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
