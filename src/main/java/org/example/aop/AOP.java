package org.example.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
@EnableAspectJAutoProxy
public class AOP {
   @Before("execution(public void logic())")
   public void log(){
       System.out.println("logging code place here");
   }
   @After("execution(public void logic())")
   public void security(){
       System.out.println("Security code place here");
   }
   public void transactionStarted(){
       System.out.println("Transaction is started now..,");
   }
   public void transactionEnded(){
       System.out.println("Transaction is ended now and all the changes are updated in the database");
   }
}
