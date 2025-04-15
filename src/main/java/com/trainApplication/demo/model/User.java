package com.trainApplication.demo.model;

import lombok.Data;

@Data
public class User {
    private String name;
    private String surname;
    private String age;
    private String gender;
    private String mail;

    public User(String name,String surname,String age,String gender,String mail){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.mail = mail;
    }
}
