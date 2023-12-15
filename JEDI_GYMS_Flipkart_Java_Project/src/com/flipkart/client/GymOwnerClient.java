/**
 * 
 */
package com.flipkart.client;

import java.util.Scanner;

import com.flipkart.business.GymCentreService;
import com.flipkart.business.GymOwnerService;

/**
 * 
 */
public class GymOwnerClient {

	/**
	 * @param a
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GymOwnerService gymOwner = new GymOwnerService();
		Scanner in = new Scanner(System.in); 
		int op1;
		
		System.out.println("1. Gym Registration");
		System.out.println("2. Add new slots");
		System.out.println("3. View Registered Gyms");
		System.out.println("4. View Registered and free slots");
		System.out.println("5. Edit Gym details");
		System.out.println("6. Edit slots");
		System.out.println("7. Edit Profile");
		System.out.println("8. Exit");
		
		op1 = in.nextInt();
		if(op1 == 8) {
			GymApplicationClient gymApplication = new GymApplicationClient();
			gymApplication.main(null);
		}
		
		/*
		System.out.println(gymOwner.viewAllSlots(0));
		System.out.println(gymOwner.isApprovedGymOwner(0));
		System.out.println(gymOwner.isApprovedGymCenter());
		System.out.println(gymOwner.createSlot(0));
		
		gymOwner.addSlots();
		gymOwner.getOwnerDetails();
		gymOwner.addGym(0);
		gymOwner.viewAllApprovedGymCenters();
		gymOwner.viewAllGymCenters();
		*/
	}
}
