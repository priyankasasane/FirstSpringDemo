package com.spring.componentscan_excludefilterdemo;

import org.springframework.stereotype.Component;

@Component
public class ClassB {

	public ClassB() {
		super();

		System.out.println(" Class B no arg constr...........");
	}

	
}
