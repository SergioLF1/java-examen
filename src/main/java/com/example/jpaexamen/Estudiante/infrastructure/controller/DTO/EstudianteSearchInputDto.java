package com.example.jpaexamen.Estudiante.infrastructure.controller.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class EstudianteSearchInputDto {
    String surname;
    String company_email;
    String personal_email;
    String city;
    int numHoursWeek;
    String coments;
    com.example.jpaexamen.Estudiante.domain.branch branch;
    boolean active;
    Date createdDate;
    Date terminationDate;
}
