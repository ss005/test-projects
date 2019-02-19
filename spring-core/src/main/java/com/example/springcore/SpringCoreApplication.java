package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        System.out.println("SpringCoreApplication.main");
        ConfigurableApplicationContext configContext = SpringApplication.run(SpringCoreApplication.class, args);
        System.out.println("--------------");

//        ApplicationContextProvider provider = new ApplicationContextProvider();
//        ApplicationContext context = provider.getContext();

//        System.out.println(configContext.getBean("a"));
//        System.out.println(configContext.getBean("b"));

        A a = (A) configContext.getBean("a");
        B b = (B) configContext.getBean("b");

        /*System.out.println(a + " " + b);
        System.out.println(a.getB());*/
    }
}

