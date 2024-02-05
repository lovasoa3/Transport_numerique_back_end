package com.example.backend_transport.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

public class Reservation {
    @Id
    @Column(name = "id_reservation",nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_reservation;
    @CreationTimestamp
    private Timestamp date_reservation;
    @Column(name = "tye_payment",nullable = false)
    private String type_payment;
    @CreationTimestamp
    private Timestamp depart_date;
    @Column(name = "name",nullable = false)
    private Double tarif;
    @Column(name = "name",nullable = false)
    private String destination;
    @ManyToOne
    private Users user_RE;
}
