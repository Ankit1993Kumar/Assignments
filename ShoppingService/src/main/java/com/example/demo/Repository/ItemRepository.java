package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Entity.Item;

public interface ItemRepository {
	Item getItemById(int itemId);
    List<Item> getItemsByOrderId(int orderId);
}