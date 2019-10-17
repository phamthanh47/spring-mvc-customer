package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer curstomer);
    Customer findById(int id);
    void update(int id, Customer customer);
    void remove(int id);
    }
