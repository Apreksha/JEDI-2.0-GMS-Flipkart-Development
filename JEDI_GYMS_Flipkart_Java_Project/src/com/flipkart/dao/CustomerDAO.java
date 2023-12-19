package com.flipkart.dao;

import java.util.ArrayList;
import java.util.List;

import com.flipkart.bean.Customer;

public class CustomerDAO {
	List<Customer> customers = new ArrayList<Customer>();
	
	public void add(Customer customer) {
		customers.add(customer);
		System.out.println("Customer data successfully added");
	}
}
