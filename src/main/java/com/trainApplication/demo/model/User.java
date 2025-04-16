package com.trainApplication.demo.model;

import lombok.Data;

@Data
public class User {
    private String name;
    private String surname;
    private String age;
    private String gender;
    private String mail;

    public User() {
        // Costruttore vuoto
    }

    public User(String name, String surname, String age, String gender, String mail) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.mail = mail;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
