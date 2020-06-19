package com.sda.zadanie3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Jan");
        list.add("Stefan");
        list.add("Edward");
        list.add("Hans");
        list.forEach(s -> System.out.println(s));
        System.out.println("Now Backwards");
        list.forEachBackwards(s -> System.out.println(s));
    }
}
