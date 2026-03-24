package com.pizzaria_api.pizzaria.bussines;

import com.pizzaria_api.pizzaria.infrastructure.entitys.Pizza;
import com.pizzaria_api.pizzaria.infrastructure.repository.PizzaRepository;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {
    private PizzaRepository repository;

    public PizzaService(PizzaRepository repository){
        this.repository=repository;
    }
    public void cadastraPizza(Pizza pizza){
        repository.saveAndFlush(pizza);
    }
}
