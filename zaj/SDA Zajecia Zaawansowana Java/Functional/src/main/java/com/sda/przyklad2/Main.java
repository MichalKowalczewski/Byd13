package com.sda.przyklad2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Function<User, Boolean> function = user -> user.getImie().toUpperCase().equals("JAN");

        List<User> users = new ArrayList<>();
        users.add(new User("Jan","Nowak"));
        users.add(new User("Maria", "Curie"));
        users.add(new User("Adam", "Malysz"));
        users.add(new User("Maria", "Nowak"));
        users.forEach(user -> System.out.println(function.apply(user)));

        Function<User, String> function1 = sdlasdasjdalksdjalkhdaik -> sdlasdasjdalksdjalkhdaik.getNazwisko().toLowerCase();

        users.forEach(user -> System.out.println(function1.apply(user)));

        Predicate<User> predicateImie = user -> user.getImie().toLowerCase().equals("maria");
        Predicate<User> predicateNazwisko = user -> user.getNazwisko().toLowerCase().equals("curie");
        Predicate<User> merged = predicateImie.and(predicateNazwisko);

        User user1 = new User();

        boolean b = user1.getImie().toLowerCase().equals("maria") && user1.getNazwisko().toLowerCase().equals("curie");

        System.out.println("merged ________");
        users.forEach(user -> System.out.println(merged.test(user)));


    }
}
