package com.test.springaop.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.springaop.dao.AccountDAO;

public class MainDemoApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO accountDAO = (AccountDAO) context.getBean("accountDAO", AccountDAO.class);
		
		accountDAO.addAccount();
		
		((ConfigurableApplicationContext)context).close();
		
		
	}

}
 