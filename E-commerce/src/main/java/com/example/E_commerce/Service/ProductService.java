package com.example.E_commerce.Service;

import com.example.E_commerce.Model.Product;
import com.example.E_commerce.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    public ProductRepository productRepository;


    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    public Product CreateProduct(Product product){
        return productRepository.save(product);
    }
    public List<Product> GetAllProducts(){
        return productRepository.findAll();
    }
    public Optional GetProductById(Long id){
        return productRepository.findById(id);
    }
    public Product UpdateProduct(Product product){
        return productRepository.save(product);
    }
    public void DeleteProduct(Long id){
        productRepository.deleteById(id);
    }

}
