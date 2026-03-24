package com.pizzaria_api.pizzaria.infrastructure.repository;

import com.pizzaria_api.pizzaria.infrastructure.entitys.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
