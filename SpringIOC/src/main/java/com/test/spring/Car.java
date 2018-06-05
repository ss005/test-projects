package com.test.spring;

import org.springframework.stereotype.Component;

@Component("car")

public class Car {
	private String model ;
	private int capacity ;
	
	public Car () {
		System.out.println("Car :: default constructor ");
	}
	
	public Car(String model, int capacity) {
		super();
		this.model = model;
		this.capacity = capacity;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	

	
}
