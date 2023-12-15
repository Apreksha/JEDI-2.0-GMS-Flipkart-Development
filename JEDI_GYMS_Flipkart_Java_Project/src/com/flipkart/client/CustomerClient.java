/**
 * 
 */
package com.flipkart.client;

import java.util.Scanner;

import com.flipkart.business.CustomerService;

/**
 * 
 */
public class CustomerClient {

	/**
	 * @param args
	 */
	
	public static void customerMenu() {	
		
		CustomerService customer = new CustomerService();
		Scanner in = new Scanner(System.in); 
		int op1;
		System.out.println(customer.getCustomerDetails());
		
		System.out.println("1. Search Gym");
		System.out.println("2. Book a slot");
		System.out.println("3. View Booked slots");
		System.out.println("4. Cancel Booking");
		System.out.println("5. Make Payment");
		System.out.println("7. Edit Profile");
		System.out.println("8. Exit");
		
		op1 = in.nextInt();
		if(op1 == 8) {
			GymApplicationClient gymApplication = new GymApplicationClient();
			gymApplication.main(null);
		}
	}
}
