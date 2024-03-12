package org.example.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        BeanFactory bean = new FileSystemXmlApplicationContext("C:\\Users\\kcs463\\Downloads\\demo\\spring-basic\\spring.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\kcs463\\Downloads\\demo\\spring-basic\\spring.xml");
/*
		Without manually initiating the car object with spring the spring create an object for that default all the bean classes are singleton classes
		that means only one object is created for that whole bean when we are trying to create more than one object it simply gives the reference of the exiting ones
     	BUT WE CAN ABLE CHANGE THE SINGLETON CLASS PATTERN
     	In prototype if you didn't call an object it doesn't create an object reference for you but in singleton if you doesn't call the object if also create a object reference for one time
*/

/*	//  ALL THE SPRING BEANS ARE SINGLETON BEANS [DEFAULT]

        Car c1 = (Car) bean.getBean("car");
        c1.setSpeed(100);
        System.out.println("C1 speed :- "+c1.getSpeed());
        Car c2 = (Car) bean.getBean("car");
        System.out.println("C2 speed :- "+c2.getSpeed());
 */
 /*
    CHANGE THE BEAN DESIGN PATTERN FROM SINGLETON TO PROTOTYPE
    <bean id="car" class="org.example.core.Car" scope="prototype"> </bean>
    default the scope is assigned to the singleton
 */

//        Car c1 = (Car)context.getBean("car");
//        c1.setSpeed(100);
//        System.out.println("C1 speed :- "+c1.getSpeed());
//        Car c2 = (Car)context.getBean("car");
//        System.out.println("C2 speed :- "+c2.getSpeed()); //it printes the default speed value

/*
  In property -> for primitive type we use "value"
              -> for reference type we use "ref"
*/

 /* Constructor injection -> use <constructor-arg></constructor-arg> tag so, we pass the value with the help of value tag.
    <constructor-arg value="10"></constructor-arg>
    if we have more than one parameter in constructor
    <constructor-arg value="10"></constructor-arg>
    <constructor-arg ref="shift"></constructor-arg> // we can also pass the reference of an object.
  */

 /*
  constructor injection -> it's for necessary and no optional [using constructor-arg tag]
  setter injection -> It's may be optional [using property tag]
 */
        Car car = (Car)context.getBean("car");
        car.run();


    }
}