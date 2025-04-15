package com.trainApplication.demo.service;

import com.trainApplication.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainUsers {

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        //connessione db
        users.add(new User("waleed","arain","23","M","something"));
        users.add(new User("cristian","alloggio","30","M","something"));
        return users;
    }
}
