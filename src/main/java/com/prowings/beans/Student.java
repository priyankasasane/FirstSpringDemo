package com.prowings.beans;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Student {//collection

	int rollNo;
	String name;
	Address adr;
	Set<Long> mobNo;
	List<String> sub;
	Map<String, Integer> subWiseMarks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, Address adr, Set<Long> mobNo, List<String> sub,
			Map<String, Integer> subWiseMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.adr = adr;
		this.mobNo = mobNo;
		this.sub = sub;
		this.subWiseMarks = subWiseMarks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	public Set<Long> getMobNo() {
		return mobNo;
	}
	public void setMobNo(Set<Long> mobNo) {
		this.mobNo = mobNo;
	}
	public List<String> getSub() {
		return sub;
	}
	public void setSub(List<String> sub) {
		this.sub = sub;
	}
	public Map<String, Integer> getSubWiseMarks() {
		return subWiseMarks;
	}
	public void setSubWiseMarks(Map<String, Integer> subWiseMarks) {
		this.subWiseMarks = subWiseMarks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", adr=" + adr + ", mobNo=" + mobNo + ", sub=" + sub
				+ ", subWiseMarks=" + subWiseMarks + "]";
	}
	
	
	
	
}
