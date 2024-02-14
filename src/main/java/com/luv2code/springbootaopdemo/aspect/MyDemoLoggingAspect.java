package com.luv2code.springbootaopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all of our related advices for logging

    // let's start with an @Before advice

    @Pointcut("execution(* com.luv2code.springbootaopdemo.dao.*.*(..))")
    private void forDaoPackage() {}

    // create a poincut for getter methods
    @Pointcut("execution(* com.luv2code.springbootaopdemo.dao.*.get*(..))")
    private void getter() {}

    // create a poincut for setter methods
    @Pointcut("execution(* com.luv2code.springbootaopdemo.dao.*.set*(..))")
    private void setter() {}

    // create a poincut: include package ... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    private void forDaoPackageNoGetterSetter() {}

    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {

        System.out.println("\n=====>>> Executing @Before advise on method\n");
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void performApiAnalytics() {
        
        System.out.println("\n=====>>> Performing API analytics\n");
    }
}
