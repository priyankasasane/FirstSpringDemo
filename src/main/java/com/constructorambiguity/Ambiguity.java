package com.constructorambiguity;

public class Ambiguity {
	
	int a;
	int b;
	
//	public Ambiguity() { //if we use no arg contr. o/p order reverse
//		super();
//		System.out.println("no arg");
//	}
	
	public Ambiguity(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("int int");
	}
	
	public Ambiguity(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("double double");
	}
		

	public Ambiguity(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("string string");
	}
	
	
	
	@Override
	public String toString() {
		return "Ambiguity [a=" + a + ", b=" + b + "]";
	}
	

}
