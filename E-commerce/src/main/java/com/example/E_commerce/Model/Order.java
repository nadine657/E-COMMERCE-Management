package com.example.E_commerce.Model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name ="order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="customer_id")
    private Customer customer ;
    private EStatus status;
    private Timestamp created_at;

    public Order(long id, Customer customer, EStatus status, Timestamp created_at) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.created_at = created_at;
    }

    public Order() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", status=" + status +
                ", created_at=" + created_at +
                '}';
    }
}
