package com.bilal.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private  String password;
    private  String email;
    private  String fullName;

}
