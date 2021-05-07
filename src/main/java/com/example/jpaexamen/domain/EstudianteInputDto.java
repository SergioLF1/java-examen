package com.example.jpaexamen.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import org.dom4j.Branch;

import javax.persistence.Column;
import java.util.Date;

@Data
public class EstudianteInputDto {
    @NotNull
    @Column(name = "surname")
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
