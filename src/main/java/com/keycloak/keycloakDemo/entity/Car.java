package com.keycloak.keycloakDemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue
    private int id;

    private String brand;

    private int price;

    public Car(String brand, int price) {

        this.brand = brand;
        this.price = price;
    }
}
