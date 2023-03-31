package com.example.demo.Entity;

import java.util.Objects;

public class Customer {

	  private Long id;

	  private String name;

	  private int orderCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, orderCount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && orderCount == other.orderCount;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orderCount=" + orderCount + "]";
	}

	public Customer(Long id, String name, int orderCount) {
		super();
		this.id = id;
		this.name = name;
		this.orderCount = orderCount;
	}

	public Customer() {
		super();
		
	}

	  
	}
