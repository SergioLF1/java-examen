package com.example.jpaexamen.domain;

import lombok.Data;

import java.util.Date;

@Data
public class DTOUser {

    String id;
    String name;
    Date fechAlta;
    String email;
    String categoria;
    String ciudad;
    String comentarios;

    public DTOUser(String id, String name, Date fechAlta, String email, String categoria, String ciudad, String comentarios) {
        this.id = id;
        this.name = name;
        this.fechAlta = fechAlta;
        this.email = email;
        this.categoria = categoria;
        this.ciudad = ciudad;
        this.comentarios = comentarios;
    }

    public DTOUser(User user) {
        id = user.getId();
        name = user.getName();
        fechAlta = user.getFechAlta();
        email = user.getEmail();
        categoria = definirCategoria(user.getCategoria());
        ciudad = user.getCiudad();
        comentarios = user.getComentarios();
    }

    public String definirCategoria(String c){
        if (c.equalsIgnoreCase("front") || c.equalsIgnoreCase("back")){
            return c;
        }else {
            return "Sin definir";
        }
    }

}
