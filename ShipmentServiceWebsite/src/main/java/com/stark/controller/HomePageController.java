package com.stark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomePageController {
               
	@GetMapping("/")
	public String showHomePage(){
		System.out.println("In show Home page");
		return "Welcome to Stark Shipment Service";
	}
}
