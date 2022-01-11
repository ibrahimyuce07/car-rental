package com.ibrahim.carrental.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity(name = "user_table")
public class User {

    @Id
    private int id;
    private String name;
    private String email;
    private String password;
    private String phone;
    @OneToOne
    private Car car;

}
