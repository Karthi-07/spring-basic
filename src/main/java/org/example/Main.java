package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.nio.file.FileSystem;

public class Main {
    public static void main(String[] args) {
        BeanFactory bean = new FileSystemXmlApplicationContext("C:\\Users\\kcs463\\Downloads\\demo\\spring-basic\\spring.xml");
/*
		Without manually initiating the car object with spring the spring create an object for that default all the bean classes are singleton classes
		that means only one object is created for that whole bean when we are trying to create more than one object it simply gives the reference of the exiting ones
     	BUT WE CAN ABLE CHANGE THE SINGLETON CLASS PATTERN
*/
/*	//  ALL THE SPRING BEANS ARE SINGLETON BEANS [DEFAULT]

        Car c1 = (Car) bean.getBean("car");
        c1.setSpeed(100);
        System.out.println("C1 speed :- "+c1.getSpeed());
        Car c2 = (Car) bean.getBean("car");
        System.out.println("C2 speed :- "+c2.getSpeed());
 */
    }
}