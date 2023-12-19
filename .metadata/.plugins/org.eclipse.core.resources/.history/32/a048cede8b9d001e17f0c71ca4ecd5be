package com.flipkart.business;

import com.flipkart.DAO.UserDAOImpl;
import com.flipkart.bean.Customer;
import com.flipkart.bean.GymOwner;
import com.flipkart.bean.User;
import com.flipkart.exceptions.UserNotFoundException;

import static com.flipkart.utils.ColorConstants.ANSI_RED;
import static com.flipkart.utils.ColorConstants.ANSI_RESET;

public class UserLogicImpl implements UserLogic {
    UserDAOImpl userGMSDao = new UserDAOImpl();

    /**
     Registers a customer in the database.
     @param customerData The Customer object representing the customer data
     */
    public void registerCustomer(Customer customerData) {
        userGMSDao.registerCustomer(customerData);
    }

    /**
     Registers a gym owner in the database.
     @param ownerData The GymOwner object representing the gym owner data
     */
    public void registerGymOwner(GymOwner ownerData) {
        userGMSDao.registerGymOwner(ownerData);
    }
    /**
     Authenticates a user based on the provided user data.
     @param userData The User object representing the user data
     @return The authenticated User object if authentication is successful, null otherwise
     */
    public User authenticateUser(User userData) {
        try {
            User authenticatedUser = userGMSDao.isAuthenticated(userData);
            return authenticatedUser;
        } catch (Exception e) {
            System.out.println(ANSI_RED + "User Not Found" + ANSI_RESET);

        }
        return null;
    }
    /**
     Registers a user in the database.
     @param userData The User object representing the user data
     */
    public void registerUser(User userData) {
        userGMSDao.registerUser(userData);
    }
}


