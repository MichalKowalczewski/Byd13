package com.sda.zadanie;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Jan");
        list.add("Stefan");
        list.add("Edward");
        list.add("Hans");
        System.out.println("Zwykly for each");
        list.forEach(s -> System.out.println(s));
        System.out.println("Nasz for each");
        list.forEachBackwards(s -> System.out.println(s));
    }
}
