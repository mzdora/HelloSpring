package com.mzdora.log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class log {
    @Before("execution(* com.mzdora.log.crudImpl.*(..))")
    public void before(){
        System.out.println("======Before=======");
    }

    @After("execution(* com.mzdora.log.crudImpl.*(..))")
    public void after(){
        System.out.println("======After=======");
    }
}
