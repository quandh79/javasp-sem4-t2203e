package com.example.spring_mvc.repository;

import com.example.spring_mvc.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findCustomerByName(String name);
}
