package com.pizzaria_api.pizzaria.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product")
@Entity
public class Product extends OrderItem{

    @Column(name = "nome")
    private String nome;

    @Column(name = "tamanho")
    private String tamanho;

    @Column(name = "preco")
    private String preco;

    @Column(name = "quantidade")
    private String quantidade;

    @Override
    public BigDecimal calculaPreco() {
        return null;
    }
}
