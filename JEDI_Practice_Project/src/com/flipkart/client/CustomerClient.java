/**
 * 
 */
package com.flipkart.client;

import com.flipkart.business.CustomerService;

/**
 * 
 */
public class CustomerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService service = new CustomerService();
		System.out.println(service.createCustomer());
		System.out.println(service.updateCustomer(102));
		System.out.println(service.deleteCustomer(101));
		service.listCustomer();
	}

}
