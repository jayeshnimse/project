package com.stark.service;

import com.stark.pojos.Feedback;
import com.stark.pojos.Payment;
import com.stark.pojos.Shipment;
import com.stark.pojos.Tracking;

public interface ICustomerService {
	
	Feedback addFeedback(Feedback F);
	
	Shipment addShipment(Shipment S);
	
	String deleteShipment(int id);
	
	Tracking trackShipment(int Id);
	
	String getCharges(String weight,String src,String dest);
}