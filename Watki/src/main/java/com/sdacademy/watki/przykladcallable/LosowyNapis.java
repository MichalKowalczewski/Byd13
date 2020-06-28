package com.sdacademy.watki.przykladcallable;

import java.util.Random;
import java.util.concurrent.Callable;

//W Callable nalezy podac typ obiektu, ktory zostanie zwrocony, tutaj String
public class LosowyNapis implements Callable<String> {

    private static final String[] NAPISY = {"FILM", "SAMOCHOD", "BIURKO", "WIDELEC"};
    private static Random random = new Random();

    @Override
    public String call() throws Exception {
       return pobierzLosowyNapis();
    }

    private String pobierzLosowyNapis() {
        return NAPISY[random.nextInt(NAPISY.length)];
    }
}


