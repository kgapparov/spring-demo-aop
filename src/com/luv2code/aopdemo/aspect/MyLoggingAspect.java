package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
    @Before("execution(public void addAccount())")
    public void addAccountLogging(){
        System.out.println("Logging before execution method addAccount");
    }
}
