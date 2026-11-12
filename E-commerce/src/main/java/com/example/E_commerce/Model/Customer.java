package com.example.E_commerce.Model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Nullable
    private String name;
    @Nullable
    @Column(unique = true)
    private String email;
    @Nullable
    private String passwor_hash;

    public Customer(long id, String name, String email, String passwor_hash) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passwor_hash = passwor_hash;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswor_hash() {
        return passwor_hash;
    }

    public void setPasswor_hash(String passwor_hash) {
        this.passwor_hash = passwor_hash;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", passwor_hash='" + passwor_hash + '\'' +
                '}';
    }
};
