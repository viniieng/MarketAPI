package br.com.senai.apiProject.controller;

import br.com.senai.apiProject.entity.Product;
import br.com.senai.apiProject.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        Product newProduct = productService.save(product);
        return ResponseEntity.ok(newProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        productService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{name}")
    public List<Product> searchProductByName(@PathVariable String name) {
        return productService.searchProductByName(name);
    }
}