package com.pizzaria_api.pizzaria.infrastructure.repository;

import com.pizzaria_api.pizzaria.infrastructure.entitys.Pizza;
import com.pizzaria_api.pizzaria.infrastructure.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}
