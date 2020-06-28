package com.example.przyklad2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i=0; i<10000; i++){
            list.add("test "+i);
        }

        ListReader listReader = new ListReader(list);

        Runnable runnable1 = new ListOperator(listReader);
        Runnable runnable2 = new ListOperator(listReader);

        Thread thread1 = new Thread(runnable1,"watek 1");
        Thread thread2 = new Thread(runnable2,"watek 2");

        thread1.start();
        thread2.start();
    }
}
