package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectComapanyData {

//	//point cut expression
//	@Before("execution (* CompanyData.getCompanybyID(..))")
//	public void doPrint1() {
//		System.out.println("before used...............");
//	}
//
//	@AfterReturning("execution (* CompanyData.getCompanybyID(..))")// pojo class method
//	public void doPrint2() {
//		System.out.println("AfterReturning used (both time work if method runs or exception occurred)...............");
//
//	}
// 
//	@After("execution (* CompanyData.getCompanybyID(..))")
//	public void doPrint3() {
//		System.out.println("After used (if method run successfully)...............");
//	}
//
//	@AfterThrowing("execution (* CompanyData.getCompanybyID(..))")
//	public void doPrint4() {
//		
//		System.out.println("AfterThrowing used (if exception occurred)...............");
//	}
	
	@Around("execution (* CompanyData.getCompanybyID(..))")
	public void doPrint5(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around before...............");
		pjp.proceed();
		int i=(Integer)pjp.getArgs()[0];
		System.out.println(":::::::::::::::"+i);
		System.out.println("Around after...............");
	}

}