package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		ApplicationContext ct= new ClassPathXmlApplicationContext("person.xml");
		Person p= ct.getBean("person", Person.class);
		System.out.println(p);	//byName: 1)no arg-constr 2)setter
								//byType: 1)no arg-constr 2)setter
								//constr: all-arg constr but if all arg not found then no-arg constr and null values
										//no-arg is compulsory otherwise throw exception
	
//		Person p1= ct.getBean("person1", Person.class);
//		System.out.println(p1);
//
//		Person p2= ct.getBean("person2", Person.class);
//		System.out.println(p2);
	}

}
