package com.javabasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class clg {

	String nm;
	@Autowired
	std std;
	
	@Override
	public String toString() {
		return "clg [nm=" + nm + ", std=" + std + "]";
	}


	public std getStd() {
		return std;
	}

	public void setStd(std std) {
		System.out.println("setr clg");
		this.std = std;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public clg() {
		super();
		System.out.println("no arg clg");
	}

	public clg(String nm, com.javabasedconfiguration.std std) {
		super();
		this.nm = nm;
		this.std = std;
		System.out.println("all arg clg");
	}
}
