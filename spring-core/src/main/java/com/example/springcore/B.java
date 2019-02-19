package com.example.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

    /*public B() {
        System.out.println("Creating instance of B");
    }*/

    /*@Autowired
    public B (A a) {
        this.a = a;
    }*/
    private com.example.springcore.A a;

    @Autowired
    public void setA(A a) {
        System.out.println("Setting property a of B instance");
        this.a = a;
    }

}