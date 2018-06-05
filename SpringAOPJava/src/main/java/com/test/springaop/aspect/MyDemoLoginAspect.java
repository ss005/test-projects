package com.test.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoginAspect {
	//add advices for loging 
	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice 	() {
		System.out.println("this will be printed before adding any account with signature "
				+ "public void addAccount()");
		}
	
	
	
}
