package com.example.backend_transport.controlleur;

import ch.qos.logback.core.model.Model;
import com.example.backend_transport.model.Users;
import com.example.backend_transport.repository.UsersRepository;
import com.example.backend_transport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin
public class UserControlleur {
    @Autowired
    private UsersRepository repository;
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<Users> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/users/{id}")
    public Optional<Users> getOneUser(@PathVariable int id){
        return userService.getOneUser(id);
    }
    @PostMapping("/users")
    public List<Users> insertUser(@RequestBody Users user ){
        return userService.saveAlls(user);
    }
}
