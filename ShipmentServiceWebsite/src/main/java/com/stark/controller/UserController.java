package com.stark.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stark.pojos.Role;
import com.stark.pojos.User;
import com.stark.service.IUserService;


@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired 
	private IUserService userService;

	public UserController() {
		
	}
	@GetMapping("/home")
	public String home() {
		System.out.println("in show home form");
		return "/home";
	}
	@GetMapping("/login")
	public String showLoginFrom() {
		System.out.println("in show login form");
		return "/login";
	}

	@PostMapping("/login")  
	public String processLoginForm(@RequestParam String email, @RequestParam String password, Model map,
			HttpSession session) {
		
		System.out.println("in process login form " + email + " " + password + " " + map);
		try {
			User user = userService.authenticateUser(email, password);
			
			session.setAttribute("user_details", user);
			if (user.role == Role.CUSTOMER) {
				
				return "/customers";
			}
			return "/admin/admin";

		} catch (RuntimeException e) {
			System.out.println("err in class " + getClass() + "in  process login form " + e);
			
			map.addAttribute("message", "Invalid Login , Please retry.....");
			return "/login";
		}

	}
	
	@GetMapping("/register")
	public String registerCust() {
		return "/register";
	}
	@PostMapping("/register")
	public String registerCust(@RequestParam String name, @RequestParam String email,
			@RequestParam long mobile, @RequestParam String password,@RequestParam String role, @RequestParam String city,Model map,HttpSession session) {
		User C=new User(name, email, mobile, city, password, (Role.valueOf(role.toUpperCase())));
		userService.registerCust(C);
		session.setAttribute("user_details", C);
		if (Role.valueOf(role.toUpperCase()) == Role.CUSTOMER) {
			map.addAttribute("success", "Registration successfull...");
			return "/customers";		
		}
		 return "/admin/admin";
	}

	
	@GetMapping("/logout")
	public String userLogout(HttpSession session, Model map, HttpServletRequest request, HttpServletResponse resp) {
		System.out.println("in user logout");
	
		map.addAttribute("user_dtls", session.getAttribute("user_details"));
		
		session.invalidate();
	
		resp.setHeader("refresh", "5;url="+request.getContextPath());
		return "/login";
	}

}
