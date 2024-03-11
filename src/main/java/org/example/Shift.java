package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Shift implements FourWheeler{
    private int speed;
//    public Shift(int speed){
//        this.speed=speed;
//    }
    @Override
    @Autowired
    public void run(){
        System.out.println("The shift car is moving");
    }
}

