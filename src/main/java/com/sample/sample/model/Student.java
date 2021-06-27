package com.sample.sample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document
public class Student implements Serializable {
    @Id
    private Long id;
    @Field
    private String name;
    @Field
    private String email;
    @Field
    private Integer rollNo;

    public Student(Long id, String name, String email, Integer rollNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.rollNo = rollNo;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
