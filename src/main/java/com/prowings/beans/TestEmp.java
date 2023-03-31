package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

	public static void main(String[] args) {

		ApplicationContext ct = new ClassPathXmlApplicationContext("EmpApplicationContext.xml");
//		Employee Emp = ct.getBean("Emp", Employee.class);// avoid casting
//		System.out.println(Emp);
		Employee Emp1 = ct.getBean("Emp1", Employee.class);
		Employee Emp_1=ct.getBean("Emp1", Employee.class);
		
		System.out.println(Emp1==Emp_1);//T(if emp is singleton)
		
		System.out.println(Emp1.adr==Emp_1.adr);//T(if emp or adr singleton)
	}

}