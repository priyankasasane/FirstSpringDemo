package com.prowings.beans;
public class Employee {//Autowiring

	int id;
	String name;
	String dept;//no autowiring for string n primitive
	Address adr;//autowiring only for address bcz its object
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String dept, Address adr) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.adr = adr;
		System.out.println("constructor injection");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
		System.out.println("setter injection");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", adr=" + adr + "]";
	}
	
	
	
}
