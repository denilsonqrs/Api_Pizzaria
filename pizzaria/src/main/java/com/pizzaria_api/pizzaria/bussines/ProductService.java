package com.pizzaria_api.pizzaria.bussines;

import com.pizzaria_api.pizzaria.infrastructure.entitys.Product;
import com.pizzaria_api.pizzaria.infrastructure.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void adicionaProduto(Product produto) {
        repository.saveAndFlush(produto);
    }

    public Product getProductById(Integer id) {
        return repository.findById(id).orElseThrow(
                () -> new RuntimeException("Produto nao encontrado")
        );
    }

    public void deleteProductById(Integer id) {
        repository.deleteById(id);
    }
    public void updateProductById(Integer id, Product product) {
        Product productEntity = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Produto nao encontrado")
        );
        Product updatedProduct = Product.builder()
                .nome(product.getNome() != null ? product.getNome() : productEntity.getNome())
                .preco(product.getNome() != null ? product.getNome() : productEntity.getNome())
                .tamanho(product.getNome() != null ? product.getNome() : productEntity.getNome())
                .quantidade(product.getNome() != null ? product.getNome() : productEntity.getNome()
                ).build();
        repository.saveAndFlush(updatedProduct);
    }
}
