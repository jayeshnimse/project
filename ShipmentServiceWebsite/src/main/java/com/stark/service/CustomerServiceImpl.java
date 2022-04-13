package com.stark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stark.dao.FeedbackRepository;
import com.stark.dao.ShipmentRepository;
import com.stark.dao.TrackingRepository;
import com.stark.dao.UserRepository;
import com.stark.pojos.Feedback;
import com.stark.pojos.Shipment;
import com.stark.pojos.Tracking;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {
	
	

	@Autowired
	private FeedbackRepository feedrepo;
	
	@Autowired
	private ShipmentRepository shipmentrepo;

	@Autowired
	private TrackingRepository trackrepo;
	
	@Autowired
	private UserRepository custrepo;
	
	

	@Override
	public Feedback addFeedback(Feedback F) {
		return feedrepo.save(F);
	}

	@Override
	public Shipment addShipment(Shipment S) {
		
		return shipmentrepo.save(S);
	}
	
	@Override
	public String getCharges(String weight,String src, String dest) {
		String charges=Integer.toString (0);
		
		if(src.equals("Mumbai") && dest.equals("Pune") || src.equals("Pune") && dest.equals("Mumbai"))  {
			charges=Integer.toString ((Integer.parseInt(weight)*15)+2000);
		}
		else if(src.equals("Kolhapur") && dest.equals("Pune") || src.equals("Pune") && dest.equals("Kolhapur")) {
			charges=Integer.toString ((Integer.parseInt(weight)*15)+2000);
		}
		else {
				charges=Integer.toString((Integer.parseInt(weight)*15)+4000);
		}		
		
		return charges;
	}

	@Override
	public String deleteShipment(int id) {
		shipmentrepo.deleteById(id);
		return "Shipment Deleted Successfully";
	}

	@Override
	public Tracking trackShipment(int Id) {
		return trackrepo.getById(Id);
	}
	
}
