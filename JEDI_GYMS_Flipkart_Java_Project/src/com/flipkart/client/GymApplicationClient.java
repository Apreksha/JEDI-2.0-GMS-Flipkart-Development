/**
 * 
 */
package com.flipkart.client;

import java.util.Scanner;

import com.flipkart.bean.Customer;
import com.flipkart.business.AdminService;
import com.flipkart.business.CustomerService;
import com.flipkart.business.UserService;

/**
 * 
 */
public class GymApplicationClient {

	/**
	 * @param args
	 */
	public static void mainPage() {
System.out.println("Welcome to FlipFit Application");
		
		Scanner in = new Scanner(System.in);  
		System.out.println("Enter the role");
	    String role = in.next();
		
	    if(role.equalsIgnoreCase("Admin")){
	          System.out.println("Welcome to Admin Menu");
	          AdminGMSMenu admin=new AdminGMSMenu();
			  admin.AdminPage(in);
	    }
	    else if(role.equalsIgnoreCase("Customer")){
	       System.out.println("Welcome to Customer Menu");
			CustomerGMSMenu customer=new CustomerGMSMenu();
			//while(true){
				System.out.println("1. Register");
				System.out.println("2. Login");
				System.out.println("3. Exit");
				System.out.print("Enter your choice: ");
				int choice = in.nextInt();
				switch (choice) {
					case 1:
						customer.CustomerRegistration(in);
						break;
					case 2:
						login();
						break;
					case 3:
						GymApplicationClient.mainPage();
						break;
					default:
						System.out.println("Incorrect choice");
				}
	    }
	    else if(role.equalsIgnoreCase("GymOwner")){
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: " );
			int choice = sc.nextInt();
			GymGMSMenu gymOwner=new GymGMSMenu();
			System.out.println("Enter your email: ");
			String email = in.next();
			switch (choice) {
				case 1:
					gymOwner.registerGymOwner(in, email);
					gymOwner.gymOwnerPage(in, email);
					break;
				case 2:
					gymOwner.gymOwnerPage(in, email);
					break;
				case 3:
					GymApplicationClient.mainPage();
					break;
				default:
					System.out.println("Incorrect choice");
			}
	    }
		
		/*System.out.println("Welcome to flip fit application\n");
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
					admin.AdminMenu();
						
				}
				else if (role.equalsIgnoreCase("GymOwner")) {
					GymOwnerClient gymOwner = new GymOwnerClient();
					gymOwner.main(args);				
				} 
				else if (role.equalsIgnoreCase("Customer")){
					CustomerClient.customerMenu();	
				}
				else {
					System.out.println("Invalid role");
				}
				break;
				
			case 2: 
				System.out.println("Enter role");
				String roleChoosed = in.next();
				
				System.out.println("Enter id");
				int id = in.nextInt();
									
				System.out.println("Enter name");
				String name = in.next();
					
				System.out.println("Enter email");
				String email = in.next();
					
				System.out.println("Enter phone");
				int phone = in.nextInt();	
				
				System.out.println("Enter password");
				String password1 = in.next();
					
				if(roleChoosed.equals("customer")) {
					customerService.createCustomer(id, name, email, phone, password1);
				}
					
				if(roleChoosed.equals("admin")) {
					adminService.createAdmin(id, name, email, phone, password1);
				}			
		}*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService customerService = new CustomerService();
		AdminService adminService = new AdminService();
		
		

	}

}
