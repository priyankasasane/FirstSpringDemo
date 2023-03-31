package com.spring.annotations;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBank {

	public static void main(String[] args) {
		ConfigurableApplicationContext ct = new ClassPathXmlApplicationContext("bank.xml");

		Bank b= ct.getBean(Bank.class);
		Bank b1= ct.getBean("bank",Bank.class);
		System.out.println(b);
		
		Account a= ct.getBean("acc",Account.class);
		System.out.println(a);

		Amount amt = Bank.getAmount();
		System.out.println(amt);
		ct.close();

	}

}
