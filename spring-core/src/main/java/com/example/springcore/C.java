package com.example.springcore;

import org.springframework.stereotype.Component;

@Component
public class C {
    String s = "test" ;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
