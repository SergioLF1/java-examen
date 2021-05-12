package com.example.jpaexamen.infrastructure.repository;

import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ServiceDelete {
     void borrarUsuarioById(String id, HttpServletResponse response) throws IOException;
}
