package com.sdacademy.watki.przykladFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Integer> future0 = executorService.submit(new SkomplikowanyAlgorytm(51));
        Future<Integer> future1 = executorService.submit(new SkomplikowanyAlgorytm(16));
        Future<Integer> future2 = executorService.submit(new SkomplikowanyAlgorytm(37));

        int suma = future0.get() + future1.get() + future2.get();
        System.out.println(suma);
        executorService.shutdown();
    }
}
