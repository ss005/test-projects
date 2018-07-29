package com.test.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamSqlEquivalent {
	public static void main(String[] args) {
		Person person1 = new Person(1, "PersonA", 26);
		Person person2 = new Person(2, "PersonB", 27);
		Person person3 = new Person(2, "PersonC", 28);
		Person person4 = new Person(2, "PersonD", 29);
		Person person5 = new Person(2, "PersonE", 30);
		
		// Add persons to list in any order 
		List<Person> list = new ArrayList<>();
		list.add(person4);
		list.add(person2);
		list.add(person1);
		list.add(person5);
		list.add(person3);
		
		///////////

		//iterate persons and print...
		System.out.println("1-----------------------");
		list.stream().forEach(person -> System.out.println(person));
		
		System.out.println("2-----------------------");		
		list.stream().forEach(System.out::println);
		
		
		//sql - order by person name - sort
		System.out.println("3-----------------------");
		list.sort((p1, p2 ) -> p1.getName().compareTo(p2.getName()));
		list.forEach(System.out::println);
		
		System.out.println("4-----------------------");
		//List list2 = list.stream().sorted().collect();
		

		
		Map<Integer, Person> personMap = list
		.stream()
		.filter( p -> p.getAge() > 26 )
		.collect(Collectors.toMap( p1 -> ((Person)p1).getAge(), p2 -> p2));
			
		
		for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
	}

}

class Person {
	int id;
	String name;
	int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

interface Default1 {
	default void defaultMethod() {
		
	}
}
interface Defualt2 {
	
}


