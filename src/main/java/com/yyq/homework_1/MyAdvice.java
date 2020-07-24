package com.yyq.homework_1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAdvice {

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Pointcut(value = "execution(* com.yyq.*.say(..))")
    private void method(){}

    @Before("method()")
    public void before(){
        System.out.println("before<" + number + ">");
    }

    @After("method()")
    public void after(){
        System.out.println("after<" + number + ">");
    }
}
