package com.pizzaria_api.pizzaria.infrastructure.repository;

import com.pizzaria_api.pizzaria.infrastructure.entitys.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
}
