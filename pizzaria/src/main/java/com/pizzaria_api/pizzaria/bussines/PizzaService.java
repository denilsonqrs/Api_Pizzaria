package com.pizzaria_api.pizzaria.bussines;

import com.pizzaria_api.pizzaria.infrastructure.entitys.Pizza;
import com.pizzaria_api.pizzaria.infrastructure.repository.PizzaRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
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

    public Pizza getPizzabyId(Integer id){
        return repository.findById(id).orElseThrow(
                () -> new RuntimeException("Pizza não encontrada")
        );
    }

    public void deletePizzaById(Integer id){
        repository.deleteById(id);
    }
    public void updatePizzaById(Integer id, Pizza pizza){
        Pizza pizzaEntity = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Pizza nao encontrada")
        );
        Pizza updatedPizza = Pizza.builder()
                .preco(pizza.getPreco() != null ? pizza.getPreco() : pizzaEntity.getPreco())
                .sabor(pizza.getSabor() != null ? pizza.getSabor() : pizzaEntity.getSabor())
                .tamanho(pizza.getTamanho() != null ? pizza.getTamanho() : pizzaEntity.getTamanho())
                .descricao(pizza.getDescricao() != null ? pizza.getDescricao() : pizzaEntity.getDescricao())
                .build();
        repository.saveAndFlush(updatedPizza);
    }
}
