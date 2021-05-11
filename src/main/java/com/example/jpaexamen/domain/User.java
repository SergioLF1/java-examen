package com.example.jpaexamen.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import org.dom4j.Branch;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estudiantes_seq")
    @GenericGenerator(
            name = "ausencias_seq",
            strategy = "com.bosonit.staffit.shared.sequences.StringPrefixedSequenceIdGenerator",
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
    Branch branch;

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
