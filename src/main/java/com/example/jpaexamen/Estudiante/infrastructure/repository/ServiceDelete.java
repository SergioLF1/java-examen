package com.example.jpaexamen.Estudiante.infrastructure.repository;

import java.io.IOException;

public interface ServiceDelete {
    Object borrarUsuarioById(String id) throws IOException;
}
