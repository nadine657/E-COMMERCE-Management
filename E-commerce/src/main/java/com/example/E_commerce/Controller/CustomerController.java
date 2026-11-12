package com.example.E_commerce.Controller;

import com.example.E_commerce.Model.Customer;
import com.example.E_commerce.Service.CustomerServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerServices customerServices;

    public CustomerController(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerServices.createCustomer(customer);
    }
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerServices.getAllCustomers();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id){
      return ResponseEntity.of(customerServices.getCustomerById(id));
    }
}