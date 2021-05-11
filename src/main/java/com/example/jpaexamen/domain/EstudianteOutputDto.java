package com.example.jpaexamen.domain;

import org.dom4j.Branch;

import java.util.Date;

public class EstudianteOutputDto {
    String id;
    String surname;
    String company_email;
    String personal_email;
    String city;
    double numHoursWeek;
    String coments;
    Branch branch;
    boolean active;
    Date createdDate;
    Date terminationDate;

    public EstudianteOutputDto(EstudianteSearchInputDto user) {
        this.surname = user.getSurname();
        this.personal_email = user.getPersonal_email();
        this.company_email = user.getCompany_email();
        this.city = user.getCity();
        this.numHoursWeek = user.getNumHoursWeek();
        this.coments = user.getComents();
        this.branch = user.getBranch();
        this.active = user.isActive();
        this.terminationDate = user.getTerminationDate();
    }

    public EstudianteOutputDto(User user) {

        this.surname = user.getSurname();
        this.personal_email = user.getPersonal_email();
        this.company_email = user.getCompany_email();
        this.city = user.getCity();
        this.numHoursWeek = user.getNumHoursWeek();
        this.coments = user.getComents();
        this.branch = user.getBranch();
        this.active = user.isActive();
        this.terminationDate = user.getTerminationDate();

    }
}
