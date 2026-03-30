package com.pizzaria_api.pizzaria.controller;

import com.pizzaria_api.pizzaria.bussines.OrderService;
import com.pizzaria_api.pizzaria.infrastructure.entitys.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pizzaria_api.pizzaria.infrastructure.entitys.Order;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Void> adicionarPedido(@RequestBody Order order){
       orderService.adicionaPedido(order);
       return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Order> pegarPedido(@RequestParam Integer id){
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletaPedido(@RequestParam Integer id){
        orderService.deleteOrderById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizaPedido(@RequestParam Integer id, @RequestBody Order order){
        orderService.updateOrderById(id, order);
        return ResponseEntity.ok().build();
    }

}
