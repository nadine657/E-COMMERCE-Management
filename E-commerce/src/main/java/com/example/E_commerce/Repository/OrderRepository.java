
package com.example.E_commerce.Repository;

import com.example.E_commerce.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
