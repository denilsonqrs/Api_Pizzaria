package com.pizzaria_api.pizzaria.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "order")
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "item_pedido_id")
    private OrderItem orderItem;

    @Column(name = "quantidade_item_pedido")
    private Integer quantidade;

    @Column(name = "preco_item_pedido")
    private BigDecimal preco;
}
