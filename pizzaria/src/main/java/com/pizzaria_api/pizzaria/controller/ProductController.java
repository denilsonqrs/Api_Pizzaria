package com.pizzaria_api.pizzaria.controller;

import com.pizzaria_api.pizzaria.bussines.ProductService;
import com.pizzaria_api.pizzaria.infrastructure.entitys.Pizza;
import com.pizzaria_api.pizzaria.infrastructure.entitys.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Void> adicionarProduto(@RequestBody Product produto){
        productService.adicionaProduto(produto);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<Product> pegarProduto(@RequestParam Integer id){
        return ResponseEntity.ok(productService.getProductById(id));
    }
    @DeleteMapping
    public ResponseEntity<Void> deletaProduto(@RequestParam Integer id){
        productService.deleteProductById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> updateProduto(@RequestParam Integer id, @RequestBody Product product){
        productService.updateProductById(id, product);
        return ResponseEntity.ok().build();
    }
}
