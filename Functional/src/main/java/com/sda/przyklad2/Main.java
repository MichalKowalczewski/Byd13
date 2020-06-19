package com.sda.przyklad2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Function<User, Boolean> function = user -> user.getFirstName().toUpperCase().equals("JAN");
        List<User> users = new ArrayList<>();
        users.add(new User("Adam", "Malysz"));
        users.add(new User("Maria", "Curie"));
        users.add(new User("Jan", "Nowak"));
        users.add(new User("jan", "kowalski"));
        users.forEach(user -> System.out.println(function.apply(user)));

        UserDisplayer userDisplayer = new UserDisplayer();

        userDisplayer.display(() -> users.get(2));

    }
}
