package com.test.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    BeanA beanA;

//    @Autowired
//    public BeanB(BeanA beanA) {
//        this.beanA = beanA;
//    }
}
