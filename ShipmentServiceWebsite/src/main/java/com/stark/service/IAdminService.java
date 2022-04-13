package com.stark.service;

import java.util.List;

import com.stark.pojos.Feedback;
import com.stark.pojos.Payment;
import com.stark.pojos.Shipment;
import com.stark.pojos.Tracking;
import com.stark.pojos.User;

public interface IAdminService {

	     //to get all Customers
		 List<User> getAllCustomers();
		 
		 //to delete Customer 
		 String deleteCustomer(Integer Id);	
		 
		 String deleteShipment(Integer Id);	
		 
		 List<Feedback> getAllFeedback();
		 
		 List<Shipment> getAllShipment();
		 
		 Tracking addOrUpdateTrack(Tracking T) ;
		 
		 Payment calCharges(Payment P);
		 
		 User addUser(User C);

}
