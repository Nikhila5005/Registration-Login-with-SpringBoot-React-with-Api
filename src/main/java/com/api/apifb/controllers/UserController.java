package com.api.apifb.controllers;


import com.api.apifb.entities.User;
import com.api.apifb.repositories.UserRepository;
import com.api.apifb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
@CrossOrigin(value="*")

public class UserController {



  @Autowired
  private UserRepository userRepository;

    @GetMapping("/register")


public List<User> getAllUsers() {

    return userRepository.findAll();
}
    @GetMapping("/register/{id}")
    public Optional<User> getAllUsers(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @PostMapping("/register")
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        // Save user to the database
        userRepository.save(user);
        // Return a success message
        return ResponseEntity.ok("User registered successfully");
    }



}
