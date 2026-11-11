
package com.example.E_commerce.Model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nullable
    private String name;

    @Nullable
    @Column(unique = true)
    private String email;

    @Nullable
    private String passwor_hash;

    // Constructor
    public Customer(Long id, String name, String email, String passwor_hash) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passwor_hash = passwor_hash;
    }

    // Default constructor
    public Customer() {
    }

    // Getter and Setter for ID
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for Password Hash
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
                '}';
    }
}
