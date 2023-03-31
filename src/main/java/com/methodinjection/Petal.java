package com.methodinjection;

public class Petal {
	 
	int no;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		System.out.println("setting no of ptls");
		this.no = no;
	}

	@Override
	public String toString() {
		return "Petal [no=" + no + "]";
	}
	
}
