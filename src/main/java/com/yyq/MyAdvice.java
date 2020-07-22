package com.yyq;

public class MyAdvice {

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void before(){
        System.out.println("before<" + number + ">");
    }

    public void after(){
        System.out.println("after<" + number + ">");
    }
}
