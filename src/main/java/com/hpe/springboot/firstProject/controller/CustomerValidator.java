package com.hpe.springboot.firstProject.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Component
public class CustomerValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "customer.name.blank", "Name is required");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "customer.email.blank", "Email is required");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "customer.password.blank", "Password is required");
	}

}
