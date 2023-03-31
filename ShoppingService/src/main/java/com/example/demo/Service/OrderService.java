package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Item;

public class OrderService {

	public static double calculateOrderTotal(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}