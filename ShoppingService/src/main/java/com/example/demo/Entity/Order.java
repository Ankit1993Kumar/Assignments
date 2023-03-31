package com.example.demo.Entity;

import java.util.List;
import java.util.Objects;

public class Order {

		  private Long id;

		  private Long customerId;

		  private List<Order> items;

		  private double total;

		  private double discount;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getCustomerId() {
			return customerId;
		}

		public void setCustomerId(Long customerId) {
			this.customerId = customerId;
		}

		public List<Order> getItems() {
			return items;
		}

		public void setItems(List<Order> items) {
			this.items = items;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public double getDiscount() {
			return discount;
		}

		public void setDiscount(double discount) {
			this.discount = discount;
		}

		@Override
		public int hashCode() {
			return Objects.hash(customerId, discount, id, items, total);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Order other = (Order) obj;
			return Objects.equals(customerId, other.customerId)
					&& Double.doubleToLongBits(discount) == Double.doubleToLongBits(other.discount)
					&& Objects.equals(id, other.id) && Objects.equals(items, other.items)
					&& Double.doubleToLongBits(total) == Double.doubleToLongBits(other.total);
		}

		@Override
		public String toString() {
			return "Order [id=" + id + ", customerId=" + customerId + ", items=" + items + ", total=" + total
					+ ", discount=" + discount + "]";
		}

		public Order(Long id, Long customerId, List<Order> items, double total, double discount) {
			super();
			this.id = id;
			this.customerId = customerId;
			this.items = items;
			this.total = total;
			this.discount = discount;
		}

		public Order() {
			super();
			
		}

		 
		  
		  
		}
    
