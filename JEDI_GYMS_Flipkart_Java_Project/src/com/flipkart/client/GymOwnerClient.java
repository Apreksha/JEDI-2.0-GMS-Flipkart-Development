/**
 * 
 */
package com.flipkart.client;

import com.flipkart.business.GymCentreService;
import com.flipkart.business.GymOwnerService;

/**
 * 
 */
public class GymOwnerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GymOwnerService gymOwner = new GymOwnerService();
		System.out.println(gymOwner.getOwnerDetails());
		System.out.println(gymOwner.viewAllSlots(0));
		System.out.println(gymOwner.isApprovedGymOwner(0));
		System.out.println(gymOwner.isApprovedGymCenter());
		System.out.println(gymOwner.createSlot(0));
		gymOwner.addSlots();
		gymOwner.getOwnerDetails();
		gymOwner.addGym(0);
		gymOwner.viewAllApprovedGymCenters();
		gymOwner.viewAllGymCenters();
	}
}
