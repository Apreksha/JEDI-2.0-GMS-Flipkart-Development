/**
 * 
 */
package com.flipkart.client;

import com.flipkart.business.AdminService;

/**
 * 
 */
public class AdminClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminService admin = new AdminService();
		System.out.println(admin.viewPendingGymOwnerRequests(0));
		System.out.println(admin.approveGymOwnerRegistration(0));
		admin.viewAllApprovedGymOwners();
		admin.viewAllApprovedGyms();
	}

}
