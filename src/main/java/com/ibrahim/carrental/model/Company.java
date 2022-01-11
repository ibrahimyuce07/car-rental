package com.ibrahim.carrental.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "company_table")
public class Company {

    @Id
    private int id;
    private String name;
    private String city;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Car> cars;
    private int totalCar;
    private int availableCar;

}
