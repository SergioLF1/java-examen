package com.example.jpaexamen.infrastructure.services;

import com.example.jpaexamen.domain.EstudianteInputDto;
import com.example.jpaexamen.domain.User;
import com.example.jpaexamen.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@Component
public class ImServicePut {
    @Autowired
    UserRepository userRepository;
    public Object updateUser(@PathVariable("id") String id, @RequestBody EstudianteInputDto dtoUser) throws IOException {
        Optional<User> userData = userRepository.findById(id);
        if (userData.isPresent()) {
            User user = userData.get();
            user = new User(dtoUser);
            userRepository.save(user);
            return user;
        } else {
            return ResponseEntity.status(401).build();
            //response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "No existe el registro");
            //return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
