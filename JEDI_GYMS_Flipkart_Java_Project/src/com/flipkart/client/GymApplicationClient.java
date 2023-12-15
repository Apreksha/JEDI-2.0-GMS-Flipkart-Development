/**
 * 
 */
package com.flipkart.client;

import java.util.Scanner;

/**
 * 
 */
public class GymApplicationClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);  
		System.out.println("Welecome to flip fit application\n");
		System.out.println("Menu for operation:");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Update Password");
		System.out.println("4. Exit");
		int op = in.nextInt();
		
		switch(op) {
			case 1: int op1;
					System.out.println("Enter username");
					String username = in.next();
					System.out.println("Enter password");
					String password = in.next();
					System.out.println("Enter role");
					String role = in.next();
					
					if(role.equalsIgnoreCase("Admin")) {
						AdminClient admin = new AdminClient();
						admin.main(args);
						
					} else if (role.equalsIgnoreCase("GymOwner")) {
						GymOwnerClient gymOwner = new GymOwnerClient();
						gymOwner.main(args);
						
					} else if (role.equalsIgnoreCase("Customer")){
						CustomerClient.customerMenu();
				
					} else {
						System.out.println("Invalid role");
					}
		
		}

	}

}
