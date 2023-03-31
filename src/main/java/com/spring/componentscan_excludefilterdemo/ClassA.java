package com.spring.componentscan_excludefilterdemo;

import org.springframework.stereotype.Component;

@Component
public class ClassA {

	public ClassA() {
		super();
		System.out.println(" Class A no arg constr...........");
	}

}
