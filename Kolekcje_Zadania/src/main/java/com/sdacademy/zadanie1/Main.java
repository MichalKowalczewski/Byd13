package com.sdacademy.zadanie1;

//6. Utwórz listę liczb: 4,7,8,3,4,8,7,89,12,1,1,5 i wyświetl te liczby bez powtórzeń

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(7);
        integerList.add(8);
        integerList.add(3);
        integerList.add(4);
        integerList.add(8);
        integerList.add(7);
        integerList.add(89);
        integerList.add(12);
        integerList.add(1);
        integerList.add(1);
        integerList.add(5);

        Set<Integer> integerSet = new HashSet<>();

        integerSet.addAll(integerList);

        for (Integer i: integerSet
             ) {
            System.out.println(i);
        }

    }
}
