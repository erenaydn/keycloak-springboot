package com.keycloak.keycloakDemo.service;

import com.keycloak.keycloakDemo.entity.Car;
import com.keycloak.keycloakDemo.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarService {
    @Autowired
    private CarRepo carRepo;

    @PostConstruct
    public void initCarTable() {
        carRepo.saveAll(
                Stream.of(
                        new Car("Bmw", 100),
                        new Car("Mercedes", 200),
                        new Car("Audi", 300)
                ).collect(Collectors.toList()));

    }

    public Car getCar(int carId) {
        return carRepo.findById(carId)
                .orElse(null);
    }

    public List<Car> getAllCar() {
        return carRepo.findAll();
    }

}
