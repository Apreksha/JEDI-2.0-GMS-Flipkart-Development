package com.flipkart.business;

public class AdminService {
	public String viewPendingGymRequests(){
		return "View pending gym requests";
	}
	
	public boolean viewPendingGymOwnerRequests(int id) {
		System.out.println("view Pending Gym Owner Requests");
		return true;
	}
	
	public boolean approveGymOwnerRegistration(int id) {
		System.out.println("approve Gym Owner Registration");
		return true;
	}
	
	public void viewAllApprovedGymOwners() {
		System.out.println("view All Approved Gym Owners");
	}
	
	public void viewAllApprovedGyms() {
		System.out.println("view All Approved Gyms");
	}
}
