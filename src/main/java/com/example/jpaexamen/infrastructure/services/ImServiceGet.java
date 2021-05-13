package com.example.jpaexamen.infrastructure.services;

import com.example.jpaexamen.infrastructure.controller.DTO.EstudianteOutputDto;
import com.example.jpaexamen.domain.User;
import com.example.jpaexamen.infrastructure.repository.ServiceGet;
import com.example.jpaexamen.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Component
public class ImServiceGet implements ServiceGet {
    @Autowired
    UserRepository userRepository;

    public List<EstudianteOutputDto> getAllContacts() {
        List<User> list = userRepository.findAll();
        List<EstudianteOutputDto> list1 = new ArrayList<EstudianteOutputDto>();
        EstudianteOutputDto dtoUser;
        for (User user : list) {
            dtoUser = new EstudianteOutputDto(user);
            list1.add(dtoUser);
        }
        return list1;
    }

    public EstudianteOutputDto getOneDto(@PathVariable String id) throws Exception {
        User user = userRepository.findById(id).orElseThrow(() -> new Exception("Not found"));
        EstudianteOutputDto dtoUser = new EstudianteOutputDto(user);
        return dtoUser;
    }
}
