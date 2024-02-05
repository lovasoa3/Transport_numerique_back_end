package com.example.backend_transport.service;

import com.example.backend_transport.model.Users;
import com.example.backend_transport.repository.UsersRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.Iterable;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private final UsersRepository repository;

    public UserService(UsersRepository repository) {
        this.repository = repository;
    }

    public List<Users> getAllUser(){
        return repository.findAll();
    }
    public Optional<Users> getOneUser(int id){
        return repository.findById(id);
    }
    @Transactional
    public List<Users> saveAlls(Users user){
        return (List<Users>) repository.save(user);
    }

}
