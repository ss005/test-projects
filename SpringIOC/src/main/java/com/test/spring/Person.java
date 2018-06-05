package com.test.spring;

import java.util.List;

import org.springframework.stereotype.Component;

@Component("person")
public class Person {

	String name;
	Car car;
	List <String> friends ;	
	int age ;
	
	public Person(Car car) {
		System.out.println("Person :: car sonstructor");
		this.car = car ;
	}
	
	
	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Person() {
//		super();
		System.out.println("Person :: default constructor ");
	}

	public Person(String name) {
		// super();
		System.out.println("Person :: person - name- constuctor ");
		this.name = name;
	}

	public Person(List< String> listOfFriends) {
		friends = listOfFriends;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void greet() {
		System.out.println("Welcome to Spring ! ");

	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Car getCar() {
		return this.car;
	}

}
