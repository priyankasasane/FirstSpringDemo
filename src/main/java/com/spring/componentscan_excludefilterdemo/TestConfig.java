package com.spring.componentscan_excludefilterdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.spring.exclude.ClassD;

@Configuration
//@ComponentScan(basePackages = "com.spring", excludeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "com.spring.exclude.*"))
@ComponentScan(basePackages = "com.spring",
				excludeFilters = @ComponentScan.Filter(
						type = FilterType.ASSIGNABLE_TYPE,
						classes = {ClassD.class} ))

public class TestConfig {

	public static void main(String[] args) {

		System.out.println("main method config.....");

		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext();

		acac.register(TestConfig.class);

		acac.refresh();
		System.out.println("main method end.....");
	}

}
