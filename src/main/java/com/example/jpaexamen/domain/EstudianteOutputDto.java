package com.example.jpaexamen.domain;

import com.sun.istack.NotNull;
import org.dom4j.Branch;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class EstudianteOutputDto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estudiantes_seq")
    @GenericGenerator(
            name = "ausencias_seq",
            strategy = "com.bosonit.staffit.shared.sequences.StringPrefixedSequenceIdGenerator",
            parameters = {
            @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "EST"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%08d")
            })
    @Column(name="id")
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
