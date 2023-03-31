package com.autowiring;

public class Person {

	School scl;
	College clg;

//	public Person(School scl, College clg) {
//		super();
//		this.scl = scl;
//		this.clg = clg;
//		System.out.println("all constr...............");
//	}

	public Person() {
		super(); // TODO Auto-generated constructor stub
		System.out.println("no arg constr...............");

	}

	public School getScl() {
		return scl;
	}

	public void setScl(School scl) {
		this.scl = scl;
		System.out.println("setting school...............");
		
	}

	public College getClg() {
		return clg;
	}

	public void setClg(College clg) {
		this.clg = clg;
		System.out.println("setting clg...............");

	}

	@Override
	public String toString() {
		return "Person [scl=" + scl + ", clg=" + clg + "]";
	}

}
