package com.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Bank {

	@Value("111")
	int bankID;
	@Autowired
	Account acc;

	@Bean
	public static Amount getAmount() {// factory method which returns any object
		Amount amt = new Amount();
		amt.setAmountInRs(50000);
		return amt;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("no arg contr...........");
	}

	public Bank(int bankID, Account acc) {
		super();
		this.bankID = bankID;
		this.acc = acc;
		System.out.println(".....all arg contr...........");

	}

	public int getBankID() {
		return bankID;
	}

	public void setBankID(int bankID) {
		this.bankID = bankID;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
		System.out.println("setting acc...........");

	}

	@Override
	public String toString() {
		return "Bank [bankID=" + bankID + ", acc=" + acc + "]";
	}

	@PostConstruct
	public void init() {
		System.out.println("init invoked in bank!!");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy invoked in bank!!");
	}
}
