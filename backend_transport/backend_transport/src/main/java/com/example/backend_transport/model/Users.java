package com.example.backend_transport.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "users")
public class Users implements Serializable {
    @Id
    @Column(name = "id_user",nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_user;

    @Column(name = "name",nullable = false,length = 255)
    private String name;

    @Column(name = "email",nullable = false,length = 255)
    private String email;

    @Column(name = "gender",nullable = false,length = 255)
    private String gender;

    @Column(name = "numero",nullable = false,length = 20)
    private String numero;

    @Column(name = "cin",nullable = false,length = 30)
    private String cin;

    @Column(name = "adresse",nullable = false,length = 200)
    private String adresse;
}
