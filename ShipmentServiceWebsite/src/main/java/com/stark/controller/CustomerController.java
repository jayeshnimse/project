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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stark.pojos.Feedback;
import com.stark.pojos.Shipment;
import com.stark.service.ICustomerService;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private ICustomerService customerService;

	public CustomerController() {
		System.out.println("in ctor of " + getClass());
	}

	@GetMapping("/addFeedback")
	public String addFeedback() {
		System.out.println("in addFeedback");
		return "/customer/feedback";
	}

	@PostMapping("/addFeedback")
	public String addFeedback(@RequestParam int rating, @RequestParam String add) {
		Feedback F = new Feedback(rating, add);
		customerService.addFeedback(F);
		return "/customer/thankYou";
	}

	@GetMapping("/addShipment")
	public String addShipment() {
		System.out.println("in AddShipment");
		return "/addShipment";
	}

	@PostMapping("/addShipment")
	public String addShipment(@RequestParam String source, @RequestParam String destination,
			@RequestParam String weight, @RequestParam String size, @RequestParam long mobile, String charges, Model map) {
		String c = customerService.getCharges(weight, source, destination);
		Shipment S = new Shipment(source, destination, weight, size, mobile,c);
		customerService.addShipment(S);
		map.addAttribute("source", source);
		map.addAttribute("destination", destination);
		map.addAttribute("weight", weight);
		map.addAttribute("size", size);
		map.addAttribute("mobile", mobile);
		map.addAttribute("charges", c);
		
		
		return "/shipment";
	}

	@DeleteMapping("/deleteShipment/{id}")
	public String deleteShipment(@PathVariable int id) {

		return customerService.deleteShipment(id);
	}

	@GetMapping("/trackShipment/{trackId}")
	public ResponseEntity<?> trackShipment(@PathVariable int trackId) {

		try {
			return new ResponseEntity<>(customerService.trackShipment(trackId), HttpStatus.OK);
		} catch (RuntimeException e) {

			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}

}
