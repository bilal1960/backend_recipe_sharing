package com.bilal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private  String password;
    private  String email;
    private  String fullName;

}
