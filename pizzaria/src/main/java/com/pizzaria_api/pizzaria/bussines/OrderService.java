package com.pizzaria_api.pizzaria.bussines;

import com.pizzaria_api.pizzaria.infrastructure.entitys.Order;
import com.pizzaria_api.pizzaria.infrastructure.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
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

    public Order getOrderById(Integer Id){
        return repository.findById(Id).orElseThrow(
                () -> new RuntimeException("Pedido nao encontrado")
        );
    }
    public void deleteOrderById(Integer id){
        repository.deleteById(id);
    }
    public void updateOrderById(Integer id, Order order){
        Order orderEntity = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Produto nao encontrado")
        );
        Order updatedOrder = Order.builder()
                .orderItem(order.getOrderItem()!=null ? order.getOrderItem() : orderEntity.getOrderItem())
                .preco(order.getPreco()!=null ? order.getPreco() : orderEntity.getPreco())
                .quantidade(order.getQuantidade() != null ? order.getQuantidade() : orderEntity.getQuantidade())
                .id(orderEntity.getId())
                .build();
        repository.saveAndFlush(updatedOrder);
    }


}
