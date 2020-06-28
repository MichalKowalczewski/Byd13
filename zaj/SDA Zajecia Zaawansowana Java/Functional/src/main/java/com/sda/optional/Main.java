package com.sda.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Cokolwiek");
        list.add(null);

        Example example = new Example();
        list.forEach(s -> example.display(Optional.ofNullable(s)));

        list.forEach(s -> Optional.ofNullable(s).ifPresentOrElse(System.out::println,
                () -> System.out.println("Nic tam nie było")));
    }
}
