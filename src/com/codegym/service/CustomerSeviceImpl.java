package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerSeviceImpl implements  CustomerService {
    private static Map<Integer,Customer> customers;
    static {
        customers=new HashMap<>();
        customers.put(1,new Customer(1,"John","john@codegym.vn","Hanoi"));
        customers.put(2,new Customer(2,"thanh","thanh@codegym.vn","Hatay"));
        customers.put(3,new Customer(3,"chinh","chinh@codegym.vn","Haiduong"));
        customers.put(4,new Customer(4,"hieu","hieu@codegym.vn","thaibinh"));
        customers.put(5,new Customer(5,"thang","thang@codegym.vn","ninhbinh"));
        customers.put(6,new Customer(6,"hoang","hoang@codegym.vn","namdinh"));



    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<Customer>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);

    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
           customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);

    }
}
