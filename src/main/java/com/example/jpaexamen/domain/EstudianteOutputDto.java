package com.example.jpaexamen.domain;

import com.sun.istack.NotNull;
import org.dom4j.Branch;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class EstudianteOutputDto {
    @Id

    @Column(name = "id")
    String id;

    @NotNull
    @Column(name = "surname", unique = true)
    String surname;

    @NotNull
    @Column(name = "company_email", unique = true)
    String company_email;

    @NotNull
    @Column(name = "personal_email", unique = true)
    String personal_email;

    @NotNull
    @Column(name = "city")
    String city;

    @NotNull
    @Column(name = "numHoursWeek")
    int numHoursWeek;

    @Column(name = "coments")
    String coments;

    @NotNull
    @Column(name = "branch")
    Branch branch;

    @NotNull
    @Column(name = "active")
    boolean active;

    @NotNull
    @Column(name = "createdDate")
    Date createdDate;

    @Column(name = "terminationDate")
    Date terminationDate;
}
