package com.flipkart.bean;

public class Booked_Slot {
	private int id;
	private int gymCentreId;
	private int slotId;
	private String custEmail;
	private String date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGymCentreId() {
		return gymCentreId;
	}
	public void setGymCentreId(int gymCentreId) {
		this.gymCentreId = gymCentreId;
	}
	public int getSlotId() {
		return slotId;
	}
	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
