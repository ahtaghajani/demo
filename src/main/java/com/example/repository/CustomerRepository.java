package com.example.repository;

import com.example.entity.Customer;
import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByIdAndUser(Long id, User user);
}
