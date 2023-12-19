/**
 * 
 */
package com.flipkart.client;

import java.util.Scanner;


import com.flipkart.bean.Admin;
import com.flipkart.bean.Customer;
import com.flipkart.business.AdminService;

/**
 * 
 */
public class AdminClient {

	/**
	 * @param args
	 */
	
	public void approveGymCentre(Scanner in) {
        // TODO Auto-generated method stub
        System.out.println("Enter the gym Id: ");
        int gymId = in.nextInt();
        AdminService.approveGymRequest(gymId);

    }

    public void approveGymOwner(Scanner in) {
        // TODO Auto-generated method stub
        System.out.println("Enter the owner email: ");
        String email = in.next();
        adminBusiness.approveGymOwnerRequest(email);

    }

    public void viewPendingGymCentres() {
        // TODO Auto-generated method stub
        List<GymCentre> gymDetails = adminBusiness.viewPendingGymRequests();
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-16s %-13s %-16s %-16s %n", "Gym Id","Name", "Address", "Approved");
        System.out.println("--------------------------------------------------------");
        for(GymCentre gym: gymDetails) {
            System.out.printf("%-16s", gym.getGymId());
            System.out.printf("%-16s", gym.getName());
            System.out.printf("%-16s", gym.getAddress());
            if(gym.isApproved()){
                System.out.printf("%-16s", "Yes");
            }
            else
            {
                System.out.printf("%-16s", "No");
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------------------------");
    }

    public void viewPendingGymOwners() {
        // TODO Auto-generated method stub
        List<GymOwner> gymOwnerDetails = adminBusiness.viewPendingGymOwnerRequests();

        System.out.printf("%-19s %-13s %-24s %-17s %-15s %n", "Email", "Name", "Aadhaar Number", "GST Number", "Approved");
        for(GymOwner owner: gymOwnerDetails) {
            System.out.printf("%-16s\t", owner.getEmail());
            System.out.printf("%-16s\t", owner.getName());
            System.out.printf("%-16s\t", owner.getAadhar());
            System.out.printf("%-16s\t", owner.getGstNumber());
            if(owner.isApproved())
            {
                System.out.printf("%-16s\t", "Yes");
            }
            else
            {
                System.out.printf("%-16s\t", "No");
            }
            System.out.println("");
        }
        System.out.println("**********************************");
    }

    public void viewAllGyms() {
        // TODO Auto-generated method stub
        List<GymCentre> gymDetails = adminBusiness.viewAllGyms();

        System.out.printf("%-16s %-13s %-11s %16s %n", "Gym Id", "Name", "Address", "Approved");
        for(GymCentre gym: gymDetails) {
            System.out.printf("%-16s", gym.getGymId());
            System.out.printf("%-16s", gym.getName());
            System.out.printf("%-20s", gym.getAddress());
            if(gym.isApproved())
            {
                System.out.printf("%-20s", "Yes");
            }
            else
            {
                System.out.printf("%-20s", "No");
            }
            System.out.println("");
        }
        System.out.println("**********************************");
    }

    public void viewAllGymOwners() {

        List<Gym_Owner> gymOwnerDetails = adminBusiness.viewAllGymOwners();
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-15s %-13s %-16s %-12s %12s %n", "Email", "Name", "Address", "GST Number", "Approved");
        System.out.println("------------------------------------------------------------------");
        for(GymOwner owner: gymOwnerDetails) {

            System.out.printf("%-16s", owner.getEmail());
            System.out.printf("%-16s", owner.getName());
            System.out.printf("%-16s", owner.getAddress());
            System.out.printf("%-18s", owner.getGstNumber());
            if(owner.isApproved())
            {
                System.out.printf("%-18s", "Yes");
            }
            else
            {
                System.out.printf("%-18s", "No");
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
    }

    public void AdminPage(Scanner in) throws Exception {
        while(true) {
            System.out.println("1. View All Gym Owners");
            System.out.println("2. View All Pending Gym Owners");
            System.out.println("3. View All Gym Centres");
            System.out.println("4. View All Pending Gym Centres");
            System.out.println("5. Approve Gym Owner");
            System.out.println("6. Approve Gym Centre");
            System.out.println("7. Exit");
            System.out.print("Enter number: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    viewAllGymOwners();
                    break;
                case 2:
                    viewPendingGymOwners();
                    break;
                case 3:
                    viewAllGyms();
                    break;
                case 4:
                    viewPendingGymCentres();
                    break;
                case 5:
                    approveGymOwner(in);
                    break;
                case 6:
                    approveGymCentre(in);
                    break;
                case 7:
                    GymApplicationClient.mainPage();
                    break;
                default:
                    System.out.println("Invalid number");
            }
        }

    }
	
	public static void AdminMenu() {
		AdminService adminService = new AdminService();
		Admin admin = new Admin();
		Scanner in = new Scanner(System.in); 
		int option;
		
		System.out.println("1. Approve Gym Owner Registration");
		System.out.println("2. View List of Registered Gyms by id");
		System.out.println("3. View List of Registered Gyms by name");
		System.out.println("4. View List of Pending Gyms by id");
		System.out.println("5. View List of Pending Gyms by name");
		System.out.println("6. View List of Registered Customers");
		System.out.println("7. Edit Admin Profile");
		System.out.println("8. Exit");
		option = in.nextInt();
		
		if(option == 7) {
			System.out.println("1. Edit name");
			System.out.println("2. Edit email address");
			System.out.println("3. Edit phone");
			
			int subOption = in.nextInt();
			
			if(subOption == 1) {
				String name = in.next();
				admin.setAdminName(name);
				System.out.println("Name changed successfully");
			}
			
			if(subOption == 2) {
				String email = in.next();
				admin.setAdminEmailAddress(email);
				System.out.println("Email changed successfully");
			}
			
			if(subOption == 3) {
				int phone = in.nextInt();
				admin.setAdminPhone(phone);
				System.out.println("Contact number changed successfully");
			}
			
		}
		
		if(option == 8) {
			GymApplicationClient gymApplication = new GymApplicationClient();
			gymApplication.main(null);
		}
	}

}
