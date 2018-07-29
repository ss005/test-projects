package com.test.entity;

import java.util.List;

import com.test.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Person {

    String name;
    int age;
    Car car;
    List<String> friends;


    public Person() {
//		super();
        System.out.println("Person :: default constructor ");
    }

    public Person(String name) {
        // super();
        System.out.println("Person :: person - name- constuctor ");
        this.name = name;
    }

    //@Autowired
    public Person(Car car) {
        System.out.println("Person :: car arg constructor");
        this.car = car;
    }

    public Person(List<String> listOfFriends) {
        System.out.println("person::list constructor");
        friends = listOfFriends;
    }

///////////////////////////////////////////////////////////////////////////
public void setName(String name) {
    System.out.println("Person::setName");
    this.name = name;
}

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @Lookup
    public Car getCar() {
        return this.car;
        //return null ;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public List<String> getFriends() {
        return friends;
    }


    public void greet() {
        System.out.println("Welcome to Spring ! ");

    }

}
