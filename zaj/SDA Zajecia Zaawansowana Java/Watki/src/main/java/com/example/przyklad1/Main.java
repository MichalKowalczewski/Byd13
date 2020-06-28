package com.example.przyklad1;

public class Main {
    public static void main(String[] args) {
        Integer wartosc = 0;
        MyIterator myIterator = new MyIterator(wartosc);
        MyIterator myIterator2 = new MyIterator(wartosc);

        Thread watek1 = new Thread(myIterator, "watek1");
        Thread watek2 = new Thread(myIterator2, "watek2");

        watek1.start();
        watek2.start();

    }
}
