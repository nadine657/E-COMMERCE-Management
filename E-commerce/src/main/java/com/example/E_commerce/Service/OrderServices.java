
package com.example.E_commerce.Service;

import com.example.E_commerce.Model.Order;
import com.example.E_commerce.Repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServices {

    private final OrderRepository orderRepository;

    public OrderServices(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }


    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }


    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }


    public boolean deleteOrder(Long id) {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
