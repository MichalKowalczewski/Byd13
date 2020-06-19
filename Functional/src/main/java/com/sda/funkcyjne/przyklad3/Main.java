package com.sda.funkcyjne.przyklad3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Example example = new Example();

        List<String> list = new ArrayList<>();
        list.add("Cokolwiek");
        list.add(null);

        list.forEach(s -> example.display(Optional.ofNullable(s)));

        list.forEach(s -> Optional.ofNullable(s).ifPresentOrElse(System.out::println, () -> System.out.println("Nic tam nie było")));

    }
}
