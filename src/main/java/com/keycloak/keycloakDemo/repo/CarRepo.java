package com.keycloak.keycloakDemo.repo;

import com.keycloak.keycloakDemo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Integer> {
}
