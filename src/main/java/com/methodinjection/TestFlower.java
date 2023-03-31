package com.methodinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFlower {

	public static void main(String[] args) {

		ApplicationContext ct = new ClassPathXmlApplicationContext("flower.xml");

		Flower f1 = ct.getBean("flower", Flower.class);
		Flower f2 = ct.getBean("flower", Flower.class);

//		System.out.println(f1);
//		System.out.println(f2);
		System.out.println(f1 == f2);// T if flower is singleton

//		System.out.println(f1.getNewPetal());
//		System.out.println(f2.getNewPetal());
		System.out.println(f1.getNewPetal() == f2.getNewPetal());// T ONLY if petal is singleton (bcz of using lookup
																	// mtd ) F if petal is prototype

	}

}
