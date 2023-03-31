package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Entity.Order;

public interface OrderRepository {
	Order getOrderById(int orderId);
    List<Order> getOrdersByCustomerId(int customerId);
}
