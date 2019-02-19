package com.example.springcore;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCoreApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    ApplicationContext context;

    @Bean
    public A a () {
        return new A();
    }
    @Bean
    public B b() {
        return new B();
    }

    @Test
    public void testCircularDependencyWithSetterInjectionWorks(){
        A a = context.getBean(A.class);
//        B b = context.getBean(B.class);

        Assert.assertEquals("Hi", a.getMessage());

    }


}

