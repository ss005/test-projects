package com.test.config;

import com.test.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.test")
@Configuration
public class SpringContext {

    @Bean
    public Person person2(){
        return  new Person();
    }



}
