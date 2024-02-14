package com.luv2code.springbootaopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {

    @Pointcut("execution(* com.luv2code.springbootaopdemo.dao.*.*(..))")
    public void forDaoPackage() {}

    // create a poincut for getter methods
    @Pointcut("execution(* com.luv2code.springbootaopdemo.dao.*.get*(..))")
    public void getter() {}

    // create a poincut for setter methods
    @Pointcut("execution(* com.luv2code.springbootaopdemo.dao.*.set*(..))")
    public void setter() {}

    // create a poincut: include package ... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {}
}
