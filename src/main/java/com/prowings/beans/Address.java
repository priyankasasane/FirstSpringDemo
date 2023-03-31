
package com.prowings.beans;

public class Address {
	
	String city;
	String state;
	int PIN;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String state, int pIN) {
		super();
		this.city = city;
		this.state = state;
		PIN = pIN;
		System.out.println("adr constr");
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", PIN=" + PIN + "]";
	}
	


}
