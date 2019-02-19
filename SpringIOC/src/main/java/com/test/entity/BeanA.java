package com.test.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    BeanB beanB ;

//    @Autowired
//    public BeanA(BeanB beanB) {
//        this.beanB = beanB;
//    }

}
