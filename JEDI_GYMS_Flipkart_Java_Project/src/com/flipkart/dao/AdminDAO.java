package com.flipkart.dao;

import java.util.ArrayList;
import java.util.List;

import com.flipkart.bean.Admin;

public class AdminDAO {
	List<Admin> admins = new ArrayList<Admin>();
	
	public void add(Admin admin) {
		admins.add(admin);
		System.out.println("Admin data successfully added");
	}
}
