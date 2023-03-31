package com.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestComapanyData {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register(ConfigCompanyData.class);//configuration class name
		ctx.refresh();

		CompanyData c = ctx.getBean(CompanyData.class);
		c.getCompanybyID(123);

		System.out.println("the data is : "+c);

		
}
}