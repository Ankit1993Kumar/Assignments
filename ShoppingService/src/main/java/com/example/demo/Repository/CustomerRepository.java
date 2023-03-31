package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Entity.Customer;

public interface CustomerRepository {
	Customer getCustomerById(int customerId);
    List<Customer> getAllCustomers();
    List<Customer> getCustomersWithMoreThanTenOrders();
    List<Customer> getCustomersWithMoreThanTwentyOrders();
}