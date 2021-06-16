package com.example.restfulapi;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private LocalDate dob;

    public Student(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Student(String name , String email , LocalDate dob) {
        this.name=name;
        this.email=email;
        this.dob=dob;

    }

}
