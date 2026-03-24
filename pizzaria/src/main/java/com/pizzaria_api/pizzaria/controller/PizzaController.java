package com.pizzaria_api.pizzaria.controller;

import com.pizzaria_api.pizzaria.bussines.PizzaService;
import com.pizzaria_api.pizzaria.infrastructure.entitys.Pizza;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/pizza")
@RequestMapping
@RequiredArgsConstructor
public class PizzaController {
    private final PizzaService pizzaService;

    @PostMapping
    public ResponseEntity<Void> cadastrarPizza(@RequestBody Pizza pizza){
        pizzaService.cadastraPizza(pizza);
        return ResponseEntity.ok().build();
    }
}
