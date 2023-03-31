package com.spring.lifecyclemethod;

public class College {
	String city;
	int pin;
	
	public void myInit()
	{
		System.out.println("myInit invoked");
	}
	
	
	public void myDestroy()
	{
		System.out.println("myDestroy invoked");
	}
	
	public College() {
		super();
		System.out.println("no arg cnst");
	
	}
	public College(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
		System.out.println("All arg cnst");

	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
		System.out.println("setting value of city");

	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
		System.out.println("setting value of pin");

	}
	@Override
	public String toString() {
		return "College [city=" + city + ", pin=" + pin + "]";
	}
	
}
