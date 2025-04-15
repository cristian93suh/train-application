package com.trainApplication.demo.controller;

import com.trainApplication.demo.model.User;
import com.trainApplication.demo.service.TrainUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TrainAPI {
    @Autowired
    private TrainUsers trainUsers;

    @GetMapping()
    public ResponseEntity<Object> getUsers(){
        List<User> user = trainUsers.getAllUsers();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
