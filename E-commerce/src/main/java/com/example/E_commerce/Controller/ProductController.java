package com.example.E_commerce.Controller;

import com.example.E_commerce.Model.Product;
import com.example.E_commerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    public ProductService productServices;

    @Autowired
    public ProductController(ProductService productServices) {
        this.productServices = productServices;
    }
    @PostMapping
    public Product CreateProduct(@RequestBody Product product)
    {return productServices.CreateProduct(product);
    }
    public List<Product> GetAllProducts()
    {
        return productServices.GetAllProducts();
    }

}
