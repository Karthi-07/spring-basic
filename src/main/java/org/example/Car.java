package org.example;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private int speed;
    private Shift shift;
    public Car(int speed,Shift shift){
        this.speed=speed;
        this.shift=shift;
    }
    public void run(){
        System.out.println("The car is moving");
        shift.run();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
    //    System.out.println("When you use the property tag to assign the value it internally calls the setter method");
        this.speed = speed;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }
}

