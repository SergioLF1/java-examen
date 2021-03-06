package com.example.jpaexamen.Estudiante.domain;

import com.example.jpaexamen.application.StringPrefixedSequenceIdGenerator;
import com.example.jpaexamen.Estudiante.infrastructure.controller.DTO.EstudianteInputDto;
import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "uuid")
    @GenericGenerator(
            name = "uuid",
            strategy = "uuid2",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "EST"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%08d")
            })
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
    com.example.jpaexamen.application.branch branch;

    @NotNull
    @Column(name = "active")
    boolean active;

    @NotNull
    @Column(name = "createdDate")
    Date createdDate;

    @Column(name = "terminationDate")
    Date terminationDate;

    public User() {
    }

    public User(EstudianteInputDto user) {
        surname = user.getSurname();
        company_email = user.getCompany_email();
        personal_email = user.getPersonal_email();
        city = user.getCity();
        numHoursWeek = user.getNumHoursWeek();
        coments = user.getComents();
        branch = user.getBranch();
        active = user.isActive();
        createdDate = user.getCreatedDate();
        terminationDate = user.getTerminationDate();
    }

}
