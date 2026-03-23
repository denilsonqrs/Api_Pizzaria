package com.pizzaria_api.pizzaria.controller;

import com.pizzaria_api.pizzaria.bussines.ProductService;
import com.pizzaria_api.pizzaria.infrastructure.entitys.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
