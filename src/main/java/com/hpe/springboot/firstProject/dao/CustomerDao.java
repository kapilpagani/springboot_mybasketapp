package com.hpe.springboot.firstProject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hpe.springboot.firstProject.entity.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer> {
	
	public List<Customer> findByCity(String city);
	
//	public Customer searchByEmailPassword(String email, String password);


}
