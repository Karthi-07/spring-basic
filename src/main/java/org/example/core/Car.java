package org.example.core;
public class Car {
    private int speed;
    private FourWheeler fourWheeler;
    public Car(int speed,FourWheeler fourWheeler){
        this.speed=speed;
        this.fourWheeler=fourWheeler;
    }
    public void run(){
        System.out.println("The  car is moving");
        fourWheeler.run();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
    //    System.out.println("When you use the property tag to assign the value it internally calls the setter method");
        this.speed = speed;
    }

    public FourWheeler getFourWheeler() {
        return fourWheeler;
    }

    public void setShift(FourWheeler fourWheeler) {
        this.fourWheeler = fourWheeler;
    }
}

