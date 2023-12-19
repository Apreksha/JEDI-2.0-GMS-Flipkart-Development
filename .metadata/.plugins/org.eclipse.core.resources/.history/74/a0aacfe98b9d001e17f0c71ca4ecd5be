package com.flipkart.business;

import com.flipkart.bean.GymCentre;
import com.flipkart.bean.Slot;
import com.flipkart.exceptions.GymOwnerNotFoundException;
import com.flipkart.exceptions.IncorrectDataException;

import java.util.List;

public interface GymOwnerLogic {
    List<Slot> viewAllSlots();
    boolean checkIfAlreadyBooked(int gymId);
    boolean isApproved(String gymOwnerEmail);
    void addSlots(int gymCenterId, String time, String date);
    List<GymCentre> viewAllGymCenters(String gymOwnerEmail);
    void createSlot(Slot slot);
    boolean checkGymApproval(int gymId);
}
