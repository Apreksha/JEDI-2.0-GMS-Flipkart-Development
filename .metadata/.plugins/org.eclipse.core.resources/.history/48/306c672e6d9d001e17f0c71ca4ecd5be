package com.flipkart.client;

import java.util.List;
import java.util.Scanner;

import com.flipkart.bean.*;
import com.flipkart.business.CustomerLogicImpl;
import com.flipkart.business.UserLogicImpl;
import com.flipkart.exceptions.GymCentreNotFoundException;
import com.flipkart.exceptions.SlotNotFoundException;

import static com.flipkart.utils.ColorConstants.*;


public class CustomerGMSMenu {
    Customer customer = new Customer();
    CustomerLogicImpl customerGMSService = new CustomerLogicImpl();

    public void CustomerRegistration(Scanner in) throws Exception {
        System.out.println(ANSI_YELLOW + "Enter your name: ");
        String name = in.next();
        customer.setName(name);
        System.out.println("Enter your email: ");
        String email = in.next();
        customer.setEmail(email);
        System.out.println("Enter your address: ");
        String address = in.next();
        customer.setAddress(address);
        System.out.println("Enter your password: " + ANSI_RESET);
        String password = in.next();
        customer.setPassword(password);

        User user = new User(customer.getEmail(),password,1);
        UserLogicImpl userService = new UserLogicImpl();
        userService.registerUser(user);
        userService.registerCustomer(customer);
        CustomerActionPage(in,email);
    }

    public void viewCatalog(Scanner in, String email) throws Exception {
        System.out.println(ANSI_GREEN + "Welcome to FlipFit Gym Application" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Menu:-" + ANSI_RESET);
        fetchGymList();

        System.out.print(ANSI_BLUE + "Choose Gym ID: " + ANSI_RESET);
        int gymId = in.nextInt();
        boolean check = customerGMSService.checkGymApprove(gymId);

        if(!check)
        {
            System.out.println(ANSI_RED + "This gym has not been approved yet!" + ANSI_RESET);
            CustomerActionPage(in,email);
            return;
        }
        boolean slotsAvailable = customerGMSService.fetchAvilableSlots(gymId);
        if(slotsAvailable) {
            System.out.print(ANSI_BLUE + "Enter Slot ID for which you want to make booking: " + ANSI_RESET);
            String slotId = in.next();

            boolean flag =customerGMSService.checkSlotExists(slotId, gymId);
            if(!flag)
            {
                System.out.println(ANSI_RED + "No slots found for this gym" + ANSI_RESET);
                CustomerActionPage(in, email);
                return;
            }

            System.out.print(ANSI_BLUE + "Enter your Date: " + ANSI_RESET);
            String date = in.next();
            int response=0;
            try{
               response = customerGMSService.bookSlots(gymId, slotId, email, date);
            } catch (SlotNotFoundException exception){
                 System.out.println("Cheeku");
                System.out.println(exception.getMessage());
            }
            switch (response) {
                case 0:
                    System.out.println(ANSI_RED + "This time is already booked\nCancelling that slot and booking new" + ANSI_RESET);

                    break;
                case 1:
                    System.out.println(ANSI_RED + "There are no more slots left" + ANSI_RESET);
                    break;
                case 2:
                    System.out.println(ANSI_GREEN + "Congratulations your slot is booked" + ANSI_RESET);
                    break;
                default:
                    System.out.println("Incorrect choice!!! Please try again!!!");
            }
        }
        else {
            viewCatalog(in,email);
        }

    }

    public void fetchGymList() {
        List<GymCentre> gymDetails = null;
        try {
            gymDetails = customerGMSService.fetchGymList();
        } catch (GymCentreNotFoundException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println();
        System.out.println( "-----------------------------------------" + ANSI_RESET);
        System.out.printf(ANSI_BLUE + "%-14s %-16s %-16s %n", "Gym Id", "GymOwner", "GymName" + ANSI_RESET);
        System.out.println("-----------------------------------------" + ANSI_RESET);
        if(gymDetails==null) throw new NullPointerException();
        for(GymCentre gym: gymDetails) {

            System.out.printf(ANSI_YELLOW + "%-16s", gym.getGymId() );
            System.out.printf("%-16s",gym.getGymOwnerEmail());
            System.out.printf("%-20s", gym.getName() + ANSI_RESET);
            System.out.println("");
        }
        System.out.println("-----------------------------------------" + ANSI_RESET);
    }

    private void cancelBookedSlots(Scanner in, String email) {
        customerGMSService.fetchBookedSlots(email);
        System.out.print("Enter Booking ID that you want to cancel: ");
        int bookingId =in.nextInt();
        customerGMSService.cancelBookedSlots(bookingId);

    }

    public void CustomerActionPage(Scanner in, String email) throws Exception {
        int choice = 0;

        while(choice != 4) {

            System.out.println(ANSI_BLUE + "Menu:-" + ANSI_RESET);
            System.out.println(ANSI_YELLOW +"1.View Gyms \n2.View Booked Slots \n3.Cancel Booked Slots \n4.Exit" + ANSI_RESET);
            System.out.print(ANSI_BLUE + "Enter your choice: " + ANSI_RESET);
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    viewCatalog(in, email);
                    break;
                case 2:
                    customerGMSService.fetchBookedSlots(email);
                    break;
                case 3:
                    cancelBookedSlots(in, email);
                    break;
                case 4:
                    ApplicationClient.mainPage();
                    break;
                default:
                    System.out.println(ANSI_RED + "Incorrect choice!!! Please try again!!!" + ANSI_RESET);
            }
        }

    }
}