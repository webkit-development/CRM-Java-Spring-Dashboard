package com.webkit.customerrelations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.webkit.customerrelations.entity.Customer;
import com.webkit.customerrelations.entity.User;
import com.webkit.customerrelations.service.CustomerService;
import com.webkit.customerrelations.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private CustomerService customerService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index(Model customerModel, Model userModel) {
		List<Customer> customers = customerService.getCustomers();
		customerModel.addAttribute("customers", customers);
		
		List<User> users = userService.getUsers();
		userModel.addAttribute("users", users);
		return "index";
	}
}
