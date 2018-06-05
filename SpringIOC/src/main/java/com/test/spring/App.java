package com.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("Inside main method ... ");
		
//		Person person = new Person () ;
//		person.greet();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml") ;
		
		System.out.println("calling person :: getbean ");
		Person person = (Person) context.getBean("person") ;
		System.out.println(person);
		System.out.println("person name is : " + person.getName());
		person.greet();
		System.out.println("================================");

		
		System.out.println("calling person :: getCar" );
		System.out.println("calling the car :: getModel ");
		System.out.println("Model is " + person.getCar().getModel());
		System.out.println("-------"+ person.getCar());
		
		System.out.println("printing person's friends list");
		person.friends.forEach(s -> System.out.println(s));
		
		

		System.out.println("calling person :: getbean to check if person is singleton");
		//context.getBean("person");
		System.out.println(person);
		System.out.println("---------" + person.getCar());
		
		
		Person person2 = (Person)context.getBean("person");
		System.out.println(person2);
		System.out.println(person2.getCar());
		
		
		((ConfigurableApplicationContext)context).close();
		
		
		
		
	}
	
}
