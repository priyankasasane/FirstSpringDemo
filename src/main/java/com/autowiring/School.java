package com.autowiring;

public class School {
	
	int scID;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(int scID) {
		super();
		this.scID = scID;
		System.out.println("scl constr>>>>>>");
	}

	public int getScID() {
		return scID;
	}

	public void setScID(int scID) {
		this.scID = scID;
	}

	@Override
	public String toString() {
		return "Scool [scID=" + scID + "]";
	}

}
