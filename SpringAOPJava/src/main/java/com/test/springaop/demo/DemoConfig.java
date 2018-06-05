package com.test.springaop.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.test.springaop")
public class DemoConfig {
//	
//	@Bean(name="accountDAO")
//	public AccountDAO getAccountDAO()  {
//		return new AccountDAO();
//	}

}
