package com.example.demo.Service;

public class CustomerService {

	 public static final int ELIGIBLE_ORDERS_10 = 10;
	    public static final int ELIGIBLE_ORDERS_20 = 20;
	    
	    public static double calculateDiscount(int orderCount, boolean isBlackFriday) {
	        if (orderCount >= ELIGIBLE_ORDERS_20) {
	            return 0.2;
	        } else if (orderCount >= ELIGIBLE_ORDERS_10) {
	            return 0.1;
	        } else if (isBlackFriday) {
	            return 0.15;
	        } else {
	            return 0;
	        }
	    }
	}
