
package com.example.E_commerce.Controller;

import com.example.E_commerce.Model.Order;
import com.example.E_commerce.Service.OrderServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderServices orderServices;

    public OrderController(OrderServices orderServices) {
        this.orderServices = orderServices;
    }


    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderServices.createOrder(order);
    }


    @GetMapping
    public List<Order> getAllOrders() {
        return orderServices.getAllOrders();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        return ResponseEntity.of(orderServices.getOrderById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        boolean deleted = orderServices.deleteOrder(id);

        if (deleted) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
