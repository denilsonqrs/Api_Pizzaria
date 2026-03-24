package com.pizzaria_api.pizzaria.controller;

import com.pizzaria_api.pizzaria.bussines.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pizzaria_api.pizzaria.infrastructure.entitys.Order;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    public ResponseEntity<Void> adicionarPedido(@RequestBody Order order){
       orderService.adicionaPedido(order);
       return ResponseEntity.ok().build();
    }
}
