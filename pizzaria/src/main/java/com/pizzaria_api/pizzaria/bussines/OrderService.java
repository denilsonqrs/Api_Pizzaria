package com.pizzaria_api.pizzaria.bussines;

import com.pizzaria_api.pizzaria.infrastructure.entitys.Order;
import com.pizzaria_api.pizzaria.infrastructure.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository repository;
    public OrderService(OrderRepository repository){
        this.repository=repository;
    }
    public void adicionaPedido(Order order){
        repository.saveAndFlush(order);
    }


}
