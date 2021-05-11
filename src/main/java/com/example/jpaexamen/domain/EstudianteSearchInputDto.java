package com.example.jpaexamen.domain;

import lombok.Data;
import org.dom4j.Branch;

import java.util.Date;

@Data
public class EstudianteSearchInputDto {
    String surname;
    String company_email;
    String personal_email;
    String city;
    double numHoursWeek;
    String coments;
    Branch branch;
    boolean active;
    Date createDate;
    Date terminationDate;
}
