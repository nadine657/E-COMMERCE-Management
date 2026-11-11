package com.example.E_commerce.Repository;

import com.example.E_commerce.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
