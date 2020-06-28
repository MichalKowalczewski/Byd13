package com.sdacademy.watki.przykladthread2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

/*
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread.zatrzymaj();
        System.out.println("wszyscy skonczyli pracę, kończę program");

*/
        //Executor Service zarzadza tworzonymi przez nas watkami.
        //W tym wypadku uzywamy serwisu ze stala liczba watkow
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<MyThread> myThreads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread();
            executorService.submit(myThread);
            myThreads.add(myThread);
        }
        //shutdown() spowoduje, że serwis nie przyjmie już więcej zadan
        //Istniejace zadania beda wykonane do konca
        //Ta metoda nie spowoduje ze watek ktory ja wykonal (glowny w tym wypadku)
        //bedzie czekal na zakonczenie zadan ktorymi zarzadza ExecutorService.
        executorService.shutdown();
        try {
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (MyThread t : myThreads) {
            t.zatrzymaj();
        }
    }
}


