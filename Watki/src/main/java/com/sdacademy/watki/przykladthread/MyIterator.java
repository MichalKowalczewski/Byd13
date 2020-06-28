package com.sdacademy.watki.przykladthread;

public class MyIterator extends Thread {
    private int number;

    public MyIterator(int startingNumber) {
        super("z");
        this.number = startingNumber;
    }

    private void iterate() {
        for (; number < 10; number++) {
            System.out.println("Watek: " + Thread.currentThread().getId() + " Wartosc number: " + number);
        }
    }

    @Override
    public void run() {
        iterate();
    }
}
