package com.eler.ms.course.Teacher.Service.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TeacherAccounts")
public class TeacherAccount {
    
    @Id
    @Column(name = "idTeacher")
    private int idTeacher;

    @Column(name = "email")
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    public TeacherAccount(int idTeacher, String email, String firstName, String lastName) {
        this.idTeacher = idTeacher;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public TeacherAccount(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public TeacherAccount() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    
}
