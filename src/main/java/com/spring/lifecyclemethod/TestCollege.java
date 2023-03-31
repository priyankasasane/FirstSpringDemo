package com.spring.lifecyclemethod;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollege {

	public static void main(String[] args) {

//		ApplicationContext ct = new ClassPathXmlApplicationContext("college.xml");
		AbstractApplicationContext ct = new ClassPathXmlApplicationContext("college.xml");

		
		
		College clg = ct.getBean("college", College.class);

//		College clg = (College) ct.getBean("college");

		System.out.println(clg);

		ct.registerShutdownHook();// for this mtd we use AbstractApplicationContex

	}

}
