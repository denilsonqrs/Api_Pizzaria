package com.pizzaria_api.pizzaria.controller;

import com.pizzaria_api.pizzaria.bussines.PizzaService;
import com.pizzaria_api.pizzaria.infrastructure.entitys.Pizza;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping
    public ResponseEntity<Pizza> pegarPizza(@RequestParam Integer id){
        return ResponseEntity.ok(pizzaService.getPizzabyId(id));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletaPizza(@RequestParam Integer id){
        pizzaService.deletePizzaById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> updatePizza(@RequestParam Integer id, @RequestBody Pizza pizza){
        pizzaService.updatePizzaById(id, pizza);
        return ResponseEntity.ok().build();
    }
}
