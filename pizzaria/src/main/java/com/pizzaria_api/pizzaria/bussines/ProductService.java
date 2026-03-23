package com.pizzaria_api.pizzaria.bussines;

import com.pizzaria_api.pizzaria.infrastructure.entitys.Product;
import com.pizzaria_api.pizzaria.infrastructure.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public final ProductRepository repository;

    public ProductService(ProductRepository repository){
        this.repository = repository;
    }
    public void adicionaProduto(Product produto){
        repository.saveAndFlush(produto);
    }
}
