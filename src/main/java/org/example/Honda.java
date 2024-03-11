package org.example;

import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Formattable;
@Component
public class Honda implements FourWheeler {
    @Override
    @Autowired
    @Qualifier
    public void run(){
        System.out.println("The Honda car is moving");
    }
}
