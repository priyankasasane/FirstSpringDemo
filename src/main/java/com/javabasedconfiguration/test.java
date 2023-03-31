package com.javabasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//test class n config class ay be separated, for best practice
@ComponentScan//(basePackages = "com.javabasedconfiguration")
public class test {
	public static void main(String[] args) {
		
	//xml: all in xml & ClassPathXmlApplicationContext("abc.xml")
	//annotation based: context:component-scan base-pkg nm & component scan in xml & ClassPathXmlApplicationContext("abc.xml")
	//java based:@configuration and @componentScan(base-pkg nm) &  AnnotationConfigApplicationContext(test.class)
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(test.class);
//		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
//		ctx.register(test.class);
		clg c= ctx.getBean("clg",clg.class);
		System.out.println(c);
	}

}
