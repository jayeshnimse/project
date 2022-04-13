package com.stark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stark.dao.FeedbackRepository;
import com.stark.dao.PaymentRepository;
import com.stark.dao.ShipmentRepository;
import com.stark.dao.TrackingRepository;
import com.stark.dao.UserRepository;
import com.stark.pojos.Feedback;
import com.stark.pojos.Payment;
import com.stark.pojos.Shipment;
import com.stark.pojos.Tracking;
import com.stark.pojos.User;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {

	
	@Autowired
	private UserRepository customerRepo;
	
	@Autowired
	private FeedbackRepository feedrepo;
	
	@Autowired
	private PaymentRepository paymentrepo;
	
	@Autowired
	private ShipmentRepository shipmentrepo;
	
	@Autowired
	private TrackingRepository trackrepo;
	
	
	
	@Override
	public List<User> getAllCustomers() {
		
		return customerRepo.findAll();
	}

	@Override
	public List<Feedback> getAllFeedback() {
		return  feedrepo.findAll();
	}

	@Override
	public String deleteCustomer(Integer Id) {
		
		customerRepo.deleteById(Id);
		return "Customer with Id= "+Id+" Deleted Successfully";
	}
	
	@Override
	public String deleteShipment(Integer Id) {
		
		shipmentrepo.deleteById(Id);
		return "Shipment with Id= "+Id+" Deleted Successfully";
	}
	
	

	@Override
	public List<Shipment> getAllShipment() {
		
		return shipmentrepo.findAll();
	}

	@Override
	public Tracking addOrUpdateTrack(Tracking T) {
		return trackrepo.save(T);
	}

	@Override
	public Payment calCharges(Payment P) {
		return paymentrepo.save(P);
	}

	@Override
	public User addUser(User C) {
		return customerRepo.save(C);
	}
	

	
}
