package com.javabasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class std {
	int id;

	@Autowired
	Address adr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setr std");
		this.id = id;
	}

	@Override
	public String toString() {
		return "std [id=" + id + ", adr=" +adr+  "]";
	}

	public std(int id) {
		super();
		this.id = id;
		System.out.println("all arg std");

	}

	public std() {
		super();
		System.out.println("no arg std");

	}
}
