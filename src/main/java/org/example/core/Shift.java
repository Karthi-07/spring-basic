package org.example.core;

public class Shift implements FourWheeler{
    private int speed;
//    public Shift(int speed){
//        this.speed=speed;
//    }
    @Override
    public void run(){
        System.out.println("The shift car is moving");
    }
}

