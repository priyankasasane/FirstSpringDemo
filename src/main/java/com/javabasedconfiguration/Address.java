package com.javabasedconfiguration;

import org.springframework.stereotype.Component;

@Component
public class Address {

	String city;

	public Address() {
		super();
		System.out.println("no arg adr");
	}

	public Address(String city) {
		super();
		this.city = "pune";
		System.out.println("all arg adr");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("setter adr");
		this.city = "pune";
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

}
