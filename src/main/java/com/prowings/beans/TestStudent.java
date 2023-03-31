package com.prowings.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestStudent {

	public static void main(String[] args) {

	ApplicationContext ct=new ClassPathXmlApplicationContext("studentapplicationcontext.xml");
	Student s1= (Student) ct.getBean("std1");
		System.out.println(s1);
	
}

}
