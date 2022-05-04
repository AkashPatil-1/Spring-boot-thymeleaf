package com.registration.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fname;
    private String lname;
    @Column(unique = true)
    private String email;
    @Column(nullable = false)
    private String phone;
    private String dob;
    @Column(nullable = false)
    private String gender;
    private String qualification;
    private String address;
    @Column(nullable = false)
    private String password;
}
