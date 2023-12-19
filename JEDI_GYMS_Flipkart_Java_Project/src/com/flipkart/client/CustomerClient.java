/**
 * 
 */
package com.flipkart.client;

import java.util.Scanner;

import com.flipkart.bean.Customer;
import com.flipkart.business.CustomerService;

/**
 * 
 */
public class CustomerClient {

	/**
	 * @param args
	 */
	
	public static void customerMenu() {	
		
		CustomerService customerService = new CustomerService();
		Customer customer = new Customer();
		Scanner in = new Scanner(System.in); 
		int option;
		System.out.println(customerService.getCustomerDetails());
		
		System.out.println("1. Search Gym");
		System.out.println("2. View Booked slots");
		System.out.println("3. Cancel Booking");
		System.out.println("4. Make Payment");
		System.out.println("5. Edit Profile");
		System.out.println("6. Exit");
		
		option = in.nextInt();
		
		if(option == 1) {
			customerService.searchGym("Location1");
		}
		else if(option == 5) {
			System.out.println("1. Edit name");
			System.out.println("2. Edit email address");
			System.out.println("3. Edit phone");
			
			int subOption = in.nextInt();
			
			if(subOption == 1) {
				String name = in.next();
				customer.setCustomerName(name);
				System.out.println("Name changed successfully");
			}
			
			if(subOption == 2) {
				String email = in.next();
				customer.setCustomerEmailAddress(email);
				System.out.println("Email changed successfully");
			}
			
			if(subOption == 3) {
				int phone = in.nextInt();
				customer.setCustomerPhone(phone);
				System.out.println("Contact number changed successfully");
			}
			
		}
		
		else if(option == 6) {
			GymApplicationClient gymApplication = new GymApplicationClient();
			gymApplication.main(null);
		}
	}
}
