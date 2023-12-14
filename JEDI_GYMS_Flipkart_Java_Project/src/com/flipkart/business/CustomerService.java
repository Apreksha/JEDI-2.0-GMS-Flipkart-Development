package com.flipkart.business;

public class CustomerService {
	public String getCustomerDetails(){
		return "get Customer Details";
	}
	
	public boolean viewAllGymCenters(int id) {
		System.out.println("view All Gym Centers");
		return true;
	}
	
	public boolean bookSlot(int id) {
		System.out.println("book slot");
		return true;
	}
	
	public void isAlreadyBooked() {
		System.out.println("is Already Booked");
	}
	
	public void cancelSlot() {
		System.out.println("cancel Slot");
	}
	
	public void viewAllBookings() {
		System.out.println("viewAllBookings");
	}
}
