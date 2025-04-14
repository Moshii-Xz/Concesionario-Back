package com.project.concessionaire.concessionaire.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "UserAdmin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adminId;

    private String username;
    private String password;

}
