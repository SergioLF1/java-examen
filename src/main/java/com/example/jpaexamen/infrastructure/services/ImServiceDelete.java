package com.example.jpaexamen.infrastructure.services;

import com.example.jpaexamen.domain.User;
import com.example.jpaexamen.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@Component
public class ImServiceDelete {
    @Autowired
    UserRepository userRepository;
    public void borrarUsuarioById(@PathVariable String id, HttpServletResponse response) throws IOException {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            userRepository.deleteById(id);
        } else {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "No existe el registro");
        }
    }
}
