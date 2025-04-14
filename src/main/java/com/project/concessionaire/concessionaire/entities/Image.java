package com.project.concessionaire.concessionaire.entities;


import jakarta.persistence.*;

@Entity
@Table(name="Images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int imageId;

    @ManyToOne
    @JoinTable(name = "Vehicles",
    joinColumns = @JoinColumn(name = "vehicleId"))
    private Vehicle vehicle;

    private String imagePath;

}
