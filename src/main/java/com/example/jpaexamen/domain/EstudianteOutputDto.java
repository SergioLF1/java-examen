package com.example.jpaexamen.domain;

import java.util.Date;

public class EstudianteOutputDto {
    String id;
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

    public EstudianteOutputDto(EstudianteSearchInputDto user) {
        this.surname = user.getSurname();
        this.personal_email = user.getPersonal_email();
        this.company_email = user.getCompany_email();
        this.city = user.getCity();
        this.numHoursWeek = user.getNumHoursWeek();
        this.coments = user.getComents();
        this.branch = user.getBranch();
        this.active = user.isActive();
        this.createdDate = user.getCreatedDate();
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
        this.createdDate = user.getCreatedDate();
        this.terminationDate = user.getTerminationDate();
    }
}
