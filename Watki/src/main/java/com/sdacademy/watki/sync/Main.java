package com.sdacademy.watki.sync;
//Utwórz dwie klasy które będą odliczały - jedna od
//100 do 0, druga od 0 do 100. Przy czym pierwsza ma
//wypisywać liczby co sekundę, a druga co pół sekundy i mają
//działać w osobnych wątkach.

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        for (int i = 0; i<10000; i++){
            lista.add("test "+i);
        }

        ListOperator listOperator = new ListOperator(lista);

        Runnable runnable1 = new ListReader(listOperator);
        Runnable runnable2 = new ListReader(listOperator);

        Thread thread = new Thread(runnable1, "watek 1");
        Thread thread2 = new Thread(runnable2, "watek 2");

        thread.start();
        thread2.start();


    }

}
