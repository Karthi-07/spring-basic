package org.example;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private int speed;
    public void run(){
        System.out.println("The car is moving");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

