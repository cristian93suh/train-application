package com.trainApplication.demo.controller;

import com.trainApplication.demo.model.User;
import com.trainApplication.demo.service.TrainUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TrainAPI {
    @Autowired
    private TrainUsers trainUsers;

    @GetMapping()
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = trainUsers.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<String> addUser(@RequestBody User user) {
        trainUsers.saveUser(user);
        return new ResponseEntity<>("User created successfully", HttpStatus.CREATED);
    }
}
