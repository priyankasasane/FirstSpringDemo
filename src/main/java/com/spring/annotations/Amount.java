package com.spring.annotations;

public class Amount {
	
	int amountInRs;

	public Amount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Amount(int amountInRs) {
		super();
		this.amountInRs = amountInRs;
	}

	public int getAmountInRs() {
		return amountInRs;
	}

	public void setAmountInRs(int amountInRs) {
		this.amountInRs = amountInRs;
	}

	@Override
	public String toString() {
		return "Amount [amountInRs=" + amountInRs + "]";
	}



}
