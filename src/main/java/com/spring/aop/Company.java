package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Company {
	int comID;
	String comName;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(int comID, String comName) {
		super();
		this.comID = comID;
		this.comName = comName;
		System.out.println("all arg constr....company");
	}

	public int getComID() {
		System.out.println("..........getting comID");
		return comID = 4500;

	}

	public void setComID(int comID) {
		this.comID = comID;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	@Override
	public String toString() {
		return "Company [comID=" + comID + ", comName=" + comName + "]";
	}

}
