package com.uum._a1;

public class HelloWorld {
    
    public static void main(String[] args) {
        HelloWorld hw= new HelloWorld();
        String hi = hw.SayHi("Sally");
        System.out.println(hi);
    }
    
    public String SayHi(String name){
        String hello = "Hello "+name;
        return hello;
    }
    
}
