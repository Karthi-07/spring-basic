package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shift implements FourWheeler{
    private int speed;
//    public Shift(int speed){
//        this.speed=speed;
//    }
    @Override
    @Qualifier
    public void run(){
        System.out.println("The shift car is moving");
    }
}

