package com.autowiring;

public class College {
	
	int clgID;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(int clgID) {
		super();
		this.clgID = clgID;
		System.out.println("clg contr>>>>>>>>>>>>");
	}

	public int getClgID() {
		return clgID;
	}

	public void setClgID(int clgID) {
		this.clgID = clgID;
	}

	@Override
	public String toString() {
		return "College [clgID=" + clgID + "]";
	}
	

}
