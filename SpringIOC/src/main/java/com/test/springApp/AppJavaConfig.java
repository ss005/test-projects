package com.test.springApp;

import com.test.config.SpringContext;
import com.test.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppJavaConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
        Person person = (Person) context.getBean("person");
        System.out.println(person);
        System.out.println(person.getCar());

        Person person2 = (Person) context.getBean("person2");
        System.out.println(person2);
        System.out.println(person2.getCar());
    }
}
