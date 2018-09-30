package com.test.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car implements Vehicle {
    private String model;
    private int capacity;

    public Car() {
        System.out.println("Car :: default constructor ");
    }

    public Car(String model, int capacity) {
        super();
        System.out.println("car::arg constructor");
        this.model = model;
        this.capacity = capacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void horn() {
        System.out.println("Car :: horn sound...");
    }
}
