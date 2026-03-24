package com.pizzaria_api.pizzaria.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "pizza")
@Entity
public class Pizza extends OrderItem {

    @Column(name = "sabor")
    private SaboresPizzaEnum sabor;

    @Column(name = "tamanho")
    private String tamanho;

    @Column(name = "preco")
    private BigDecimal preco;

    private String descricao;

    @Override
    public BigDecimal calculaPreco() {
        return null;
    }
}
