

package com.example.E_commerce.Controller;

import com.example.E_commerce.Model.Product;
import com.example.E_commerce.Service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductServices productServices;

    @Autowired
    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }


    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productServices.createProduct(product);
    }


    @GetMapping
    public List<Product> getAllProducts() {
        return productServices.getAllProducts();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        return ResponseEntity.of(productServices.getProductById(id));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {

        boolean deleted = productServices.deleteProduct(id);

        if (deleted) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
