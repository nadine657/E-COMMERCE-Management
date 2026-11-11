
package com.example.E_commerce.Service;

import com.example.E_commerce.Model.Product;
import com.example.E_commerce.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    private final ProductRepository productRepository;

 @Autowired

    public ProductServices(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Product createProduct(Product product) {
        return productRepository.save(product);
    }


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }


    public boolean deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
