package com.project.concessionaire.concessionaire.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;

    private String brand;
    private String model;
    private int year;
    private double price;
    private String description;
}
