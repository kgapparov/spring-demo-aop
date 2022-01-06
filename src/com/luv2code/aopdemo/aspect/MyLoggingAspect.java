package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
    /**
     * Pointcut Expression Examples
     *
     * specific to AccountDAO method
     *  @Before("execution (public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
     *
     * Any class and any method starts with add
     * @Before("execution (public void *.add*())")
     *
     * Match addAccount method that have Account param
     * @Before("execution (* addAccount(com.luv2code.aopdemo.Account))
     *
     * Match addAccount method with any type and any param count
     * @Before("execution (* addAccount(..))")
     */
//      @Before("execution(public void addAccount())")
//    @Before("execution (public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
//    @Before("execution (public void *.add*())")
    @Before("execution (* addAccount(..))")
    public void addAccountLogging(){
        System.out.println("===>Logging before execution method addAccount");
    }
    @Before("execution (* add*(com.luv2code.aopdemo.Account))")
    public void addAccountLogginsecond(){
        System.out.println("====> Logging before execution method with PARAMETER joints");
    }
}
