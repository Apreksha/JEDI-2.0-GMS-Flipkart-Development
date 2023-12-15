package com.flipkart.io;
import java.util.Scanner;

public class FlipFitScanner {
	public static void main(String args[]) {
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
						System.out.println("1. Approve Gym Owner Registration");
						System.out.println("2. View List of Registered Gyms by id");
						System.out.println("3. View List of Registered Gyms by name");
						System.out.println("4. View List of Pending Gyms by id");
						System.out.println("5. View List of Pending Gyms by name");
						System.out.println("6. View List of Registered Customers");
						System.out.println("7. Edit Admin Profile");
						System.out.println("8. Exit");
						op1 = in.nextInt();
						
					} else if (role.equalsIgnoreCase("GymOwner")) {
						System.out.println("1. Gym Registration");
						System.out.println("2. Add new slots");
						System.out.println("3. View Registered Gyms");
						System.out.println("4. View Registered and free slots");
						System.out.println("5. Edit Gym details");
						System.out.println("6. Edit slots");
						System.out.println("7. Edit Profile");
						System.out.println("8. Exit");
						
						op1 = in.nextInt();
					} else if (role.equalsIgnoreCase("Custoemr")){
						System.out.println("1. Search Gym");
						System.out.println("2. Book a slot");
						System.out.println("3. View Booked slots");
						System.out.println("4. Cancel Booking");
						System.out.println("5. Make Payment");
						System.out.println("7. Edit Profile");
						System.out.println("8. Exit");
						
						op1 = in.nextInt();
					} else {
						System.out.println("Invalid role");
					}
		
		}
	}
}
