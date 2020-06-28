package com.sdacademy.watki.przykladthread;

public class Main {

    public static void main(String[] args) {
        Thread watek1 = new MyIterator(0);
        Thread watek2 = new MyIterator(0);

        watek1.start();
        watek2.start();
    }
}
