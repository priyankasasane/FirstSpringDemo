package com.constructorambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAmbiguity {
	public static void main(String[] args) {
		
		ApplicationContext ct=new ClassPathXmlApplicationContext("ambiguity.xml");
		 Ambiguity amb= ct.getBean("AmbiguityTest", Ambiguity.class);
		 System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>" +amb);
		
	}

}
