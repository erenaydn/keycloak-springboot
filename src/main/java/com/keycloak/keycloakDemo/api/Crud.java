package com.keycloak.keycloakDemo.api;

import com.keycloak.keycloakDemo.entity.Car;
import com.keycloak.keycloakDemo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class Crud {
    @Autowired
    private CarService carService;

    @GetMapping("{carid}")
    @RolesAllowed("defaultUser")// this method can be accessed by user whose role is defaultUser
    public ResponseEntity<Car> findCar(@PathVariable int carId) {
        return ResponseEntity.ok(carService.getCar(carId));
    }

    @GetMapping()
    @RolesAllowed("admin") // this method can be accessed by user whose role is admin
    public ResponseEntity<List<Car>> getAllCars() {
        return ResponseEntity.ok(carService.getAllCar());
    }
}
