package com.example.backend_transport.service;

import com.example.backend_transport.model.Users;
import com.example.backend_transport.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
     @Autowired
    private UsersRepository repository;

    public void registreUser(Users users) {
        repository.save(users);

    }
    public List<Users> listUsers(){
       return repository.findAll();
    }
    public Optional<Users> oneUser(Integer id){
        return repository.findById(id);
    }
}
