package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class CompanyData {

	public Company getCompanybyID(int i) {
	      	
	    	
	        System.out.println("Method getCompanyById() called");
//	        if(true)
//	        throw new NullPointerException("exception occurred");
	        
	        return new Company(10, "Ram");
	}
	}

