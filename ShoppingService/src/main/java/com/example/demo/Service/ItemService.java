package com.example.demo.Service;

public class ItemService {

	public static double calculateDiscountedPrice(double price, double discount) {
        return price * (1 - discount);
    }
}