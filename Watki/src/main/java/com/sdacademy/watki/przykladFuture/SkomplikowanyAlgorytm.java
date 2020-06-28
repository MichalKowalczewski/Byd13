package com.sdacademy.watki.przykladFuture;

import java.util.concurrent.Callable;

public class SkomplikowanyAlgorytm implements Callable<Integer> {

    private Integer liczba;

    public SkomplikowanyAlgorytm(Integer liczba) {
        this.liczba = liczba;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        return obliczWynik();
    }

    private int obliczWynik(){
        return liczba;
    }

}
