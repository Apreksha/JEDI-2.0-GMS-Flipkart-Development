package com.flipkart.business;

public interface CustomerInterface {
	//we declare all the method inside the interface and implement inside the customer service
	
	public String createCustomer();
	public boolean deleteCustomer(int id);
	public boolean updateCustomer(int id);
	public void listCustomer();
}
