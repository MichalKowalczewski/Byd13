package com.sda.zadanie1;

public class User {

    @Example(value = "hello", myNumber = 5)
    public void hello(){
        System.out.println("Hello World");
    }
    public void notHello(){
        System.out.println("Not Hello World");
    }

    @Example(value = "veryNotHello", myNumber = 2)
    public void veryNotHello(){
        System.out.println("Very Not Hello World");
    }
}
