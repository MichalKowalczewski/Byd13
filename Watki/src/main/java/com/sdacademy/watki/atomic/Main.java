package com.sdacademy.watki.atomic;
//Utwórz dwie klasy które będą odliczały - jedna od
//100 do 0, druga od 0 do 100. Przy czym pierwsza ma
//wypisywać liczby co sekundę, a druga co pół sekundy i mają
//działać w osobnych wątkach.

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {


    public static void main(String[] args) {
        AtomicExample atomicExample = new AtomicExample();
        NonAtomicExample nonAtomicExample = new NonAtomicExample();
        //atomicExample.test();
        nonAtomicExample.test();


    }

}
