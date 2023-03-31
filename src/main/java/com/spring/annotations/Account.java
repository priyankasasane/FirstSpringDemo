package com.spring.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Account {
	
	@Value("AM20034")
	String accNo;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accNo) {
		super();
		this.accNo = accNo;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + "]";
	}

}
