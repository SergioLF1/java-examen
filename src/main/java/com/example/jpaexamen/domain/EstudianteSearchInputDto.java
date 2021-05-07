package com.example.jpaexamen.domain;

import com.sun.istack.NotNull;
import org.dom4j.Branch;

import java.util.Date;

public class EstudianteSearchInputDto {
    @NotNull
    String surname;

    @NotNull
    String company_email;

    @NotNull
    String personal_email ;

    @NotNull
    String city ;

    @NotNull
    int numHoursWeek ;

    String coments;

    @NotNull
    Branch branch;

    @NotNull
    boolean active;

    @NotNull
    Date createdDate;

    Date terminationDate;
}
