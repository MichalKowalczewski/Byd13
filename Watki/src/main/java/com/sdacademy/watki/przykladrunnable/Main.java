package com.sdacademy.watki.przykladrunnable;

public class Main {

    public static void main(String[] args) {
        MyIterator myIterator1 = new MyIterator(0);
        MyIterator myIterator2 = new MyIterator(0);

        Thread watek1 = new Thread(myIterator1, "watek1");
        Thread watek2 = new Thread(myIterator2, "watek2");

        watek1.start();
        watek2.start();
    }
}
