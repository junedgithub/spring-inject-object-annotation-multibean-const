package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Mobile mobile;

    @Autowired
    public Person(@Qualifier(value = "moto")Mobile mobile) {
        this.mobile = mobile;
    }

    public void use(){
        System.out.println("Person is using mobile");
        mobile.ring();
    }
}
