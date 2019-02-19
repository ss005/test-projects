package com.example.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class A {

    /*public A() {
        System.out.println("Creating instance of A");
    }*/

   /* @Autowired
    public A(@Lazy B b) {
        this.b = b;
    }*/

    private com.example.springcore.B b;

    private String message = "Hi";

    @Autowired
    public void setB(B b) {
        System.out.println("Setting property b of A instance");
        this.b = b;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}