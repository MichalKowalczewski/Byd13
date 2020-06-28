package com.sdacademy.watki.przykladthread2;

import java.util.Random;

public class MyThread extends Thread {

    private int counter = 0;
    private boolean stop = false;
    private Random random = new Random();

    @Override
    public void run() {
        while(!stop) {
            counter++;
            System.out.println("Watek "+getName() + " komunikat numer: " + counter);
            try {
                //uspij watek na losowa ilosc ms
                sleep(random.nextInt(20));
            } catch (InterruptedException e) {
                stop = true;
                e.printStackTrace();
            }
        }
    }

    public void zatrzymaj() {
        stop = true;
    }
}
