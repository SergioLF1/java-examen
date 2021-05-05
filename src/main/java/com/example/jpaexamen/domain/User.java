package com.example.jpaexamen.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data


public class User {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    @Column
    String name;
    @Column
    Date fechAlta;
    @Column
    String email;
    @Column
    String categoria;
    @Column
    String ciudad;
    @Column
    String comentarios;


    public User() {
    }

    public User(DTOUser user) {
        id = user.getId();
        name = user.getName();
        fechAlta = user.getFechAlta();
        email = user.getEmail();
        categoria = user.getCategoria();
        ciudad = user.getCiudad();
        comentarios = user.getComentarios();
    }

}
