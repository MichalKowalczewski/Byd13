package com.sdacademy.watki.atomic;

import java.util.concurrent.atomic.AtomicInteger;

//https://www.baeldung.com/java-volatile

public class NonAtomicExample {
    int i = 0;
    public void test(){
        Thread runnable = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j<1000000; j++) {
                    i=i+1;
                    System.out.println(i);
                }
            }
        }, "watek 1");



        Thread runnable2 = new Thread(new Runnable() {
            @Override
            public void run() {
                i = 50;
            }
        }, "watek2");


        runnable.start();
        runnable2.start();
        System.out.println(i);
    }

    public int getI(){
        return i;
    }
}
