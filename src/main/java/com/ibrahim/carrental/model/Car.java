package com.ibrahim.carrental.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity(name = "cars_table")
public class Car {

    @Id
    private int carId;
    private CarTypeEnum carType;
    private String carBrand;
    private String carModel;
    private BigDecimal pricePerDay;
    private LocalDate priceDeadline;
    private String carImage;
    private boolean isAvailable;
    private BigDecimal additionalFee;

    @OneToOne
    private User reservedBy;
}
