package com.ibrahim.carrental.model;

public enum CarTypeEnum {
    SEDAN("Sedan"),
    SUV("SUV"),
    VAN("Van"),
    TRUCK("Truck"),
    LIMOUSINE("Limousine"),
    MINIVAN("Minivan"),
    HATCHBACK("Hatchback"),
    COUPE("Coupe"),
    CABRIOLET("Cabriolet"),
    CONVERTIBLE("Convertible");


    private String value;

    CarTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
