package com.hpe.springboot.firstProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hpe.springboot.firstProject.dao.CustomerDao;
import com.hpe.springboot.firstProject.entity.Customer;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerDao cDao;
	
	@Autowired
	CustomerValidator customerValidator;

	@RequestMapping(value="/registration-form", method=RequestMethod.GET)
	public String registerCustomer(Model model){
		model.addAttribute("customer",new Customer());
		return "registration-form";
	}
	
	@RequestMapping(value="/registration-form", method=RequestMethod.POST)
	public String save(@ModelAttribute Customer customer, Errors errors){
		System.out.println(customer.toString());
		customerValidator.validate(customer, errors);
		
		if(errors.hasErrors()){
			System.out.println("Some conversion errors");
			return "registration-form";
		}
		
		cDao.save(customer);
		return "redirect:/home";
	}
	
	@RequestMapping(value="all-cusomer", method=RequestMethod.GET)
	public String getCustomer(Model model){
		System.out.println("all-cusomer");
		
		model.addAttribute("customers",cDao.findAll());
		Iterable<Customer> customers = cDao.findAll();
		for(Customer c : customers)
			System.out.println(c.toString());
		
		return "customer";
	}
	
	@RequestMapping(value="delete-customer")
	public String deleteCustomer(Model model, @RequestParam Integer id){
		
		cDao.deleteById(id);
		model.addAttribute("customers",cDao.findAll());
//		Iterable<Customer> customers = cDao.findAll();
//		for(Customer c : customers)
//			System.out.println(c.toString());
		
		return "redirect:/all-cusomer";
	}
	
}
