package com.example.backend_transport.repository;

import com.example.backend_transport.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findUser(String name,String email,String gender,String numero,String cin,String adresse);
}
