package com.sdacademy.watki.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    public void test(){
        final AtomicInteger i = new AtomicInteger(0);
        Thread runnable = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j<1000000; j++) {
                    i.set(i.get() + 1);
                    System.out.println(i.get());
                }
            }
        }, "watek 1");



        Thread runnable2 = new Thread(new Runnable() {
            @Override
            public void run() {
                i.set(50);
            }
        }, "watek2");


        runnable.start();
        runnable2.start();
        System.out.println(i.get());
    }
}
