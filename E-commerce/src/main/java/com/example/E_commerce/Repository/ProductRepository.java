package com.example.E_commerce.Repository;

import com.example.E_commerce.Model.Customer;
import com.example.E_commerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
