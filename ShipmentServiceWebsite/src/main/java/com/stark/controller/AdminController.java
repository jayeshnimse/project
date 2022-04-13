package com.stark.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stark.pojos.Payment;
import com.stark.pojos.Tracking;
import com.stark.pojos.User;
import com.stark.service.IAdminService;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private IAdminService iAdminService;
	
	public AdminController() {
		System.out.println("In constructor of AdminController"); 
	}
	
	
	@GetMapping("/getAllCustomers")
	public String getAllCustomers(Model map) {
		System.out.println("in get all customers");
		map.addAttribute("AllCustomers", iAdminService.getAllCustomers());
		return "/admin/customers";
	}
	
	
	@GetMapping("/getAllFeedback")
	public String getAllFeedback(Model map){
		System.out.println("in get all Feedbacks");
		map.addAttribute("AllFeedbacks", iAdminService.getAllFeedback());
		return "/admin/feedbacks";
	}
	
	@GetMapping("/getAllShipment")
	public String getAllShipment(Model map) {
		System.out.println("in get all Shipments");
		map.addAttribute("AllShipments", iAdminService.getAllShipment());
		return "/admin/shipments";
	}
	
	@DeleteMapping("/deleteCustomer/{cust_id}")
	public String deleteCustomer(@PathVariable int cust_id) {
		System.out.println("In deleteCustomer()");
		return iAdminService.deleteCustomer(cust_id);
	}
	
	@DeleteMapping("/deleteShipment/{ship_id}")
	public String deleteShipment(@PathVariable int ship_id) {
		System.out.println("In deleteShipment()");
		return iAdminService.deleteCustomer(ship_id);
	}
	
	@PostMapping("/addCustomer")
	public  User addUser(@RequestBody User C ) {
		return iAdminService.addUser(C);
	}
	
	@GetMapping("/addTracking")
	public String addTracking() {
		System.out.println("in addTracking");
		return "/addTracking";
	}
	
	@PostMapping("/addTracking")
	public String addTracking(@RequestParam String inTime,@RequestParam String outTime,@RequestParam String mode,@RequestParam String loaction ) {
		Tracking T=new Tracking(inTime, outTime, loaction, mode);
		iAdminService.addOrUpdateTrack(T);
		return "/admin";
	}
	@PostMapping("/addLocation")
	public Payment calCharges(@RequestBody Payment P ) {
		return iAdminService.calCharges(P);
	}
	
	
}