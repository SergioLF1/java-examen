package com.example.jpaexamen.domain;

import lombok.Data;

import java.util.Date;

@Data
public class EstudianteInputDto {
    String surname;
    String company_email;
    String personal_email;
    String city;
    int numHoursWeek;
    String coments;
    branch branch;
    boolean active;
    Date createdDate;
    Date terminationDate;
}
