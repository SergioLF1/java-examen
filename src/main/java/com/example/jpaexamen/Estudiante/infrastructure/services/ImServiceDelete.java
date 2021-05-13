package com.example.jpaexamen.Estudiante.infrastructure.services;

import com.example.jpaexamen.Estudiante.domain.User;
import com.example.jpaexamen.Estudiante.infrastructure.repository.ServiceDelete;
import com.example.jpaexamen.Estudiante.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;
import java.util.Optional;

@Component
public class ImServiceDelete implements ServiceDelete {
    @Autowired
    UserRepository userRepository;

    public Object borrarUsuarioById(@PathVariable String id) throws IOException {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            userRepository.deleteById(id);//guardar y return
            return user;
        } else {
            return ResponseEntity.status(401).build();
            //response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "No existe el registro");
        }
    }
}
