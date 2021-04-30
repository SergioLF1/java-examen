package com.example.jpaexamen.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data


public class User {

    @Id

    @Column
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

    public void convert(DTOUser user) {
        name = user.getName();
        fechAlta = user.getFechAlta();
        email = user.getEmail();
        categoria = user.getCategoria();
        ciudad = user.getCiudad();
        comentarios = user.getComentarios();
    }
}
