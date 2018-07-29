package com.test.springApp;

import com.test.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXmlConfig {

	public static void main(String[] args) {
		System.out.println("Inside main method ... ");
		
//		Person person = new Person () ;
//		person.greet();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml") ;
		
		System.out.println("\n person::getBean 1");
		Person person = (Person) context.getBean("person") ;
		System.out.println(person);
//		System.out.println("person name is : " + person.getName());
//		person.greet();
//		System.out.println("================================");
//
//
//		System.out.println("\n person :: getCar" );
//		System.out.println("calling the car :: getModel ");
//		System.out.println("Model is " + person.getCar().getModel());
		
//		System.out.println("printing person's friends list");
//		person.friends.forEach(s -> System.out.println(s));
        System.out.println(">>>" + person.getCar());


		System.out.println("\n person :: getbean 2 - to check if person is singleton");
		Person person1 = (Person) context.getBean("person");
		System.out.println(person1);
		System.out.println(">>>" + person1.getCar());

        System.out.println("\n person::getbean 3");
		Person person2 = (Person)context.getBean("person");
		System.out.println(person2);
		System.out.println(">>>" + person2.getCar());
		
		
		((ConfigurableApplicationContext)context).close();
		
		
		
		
	}
	
}
