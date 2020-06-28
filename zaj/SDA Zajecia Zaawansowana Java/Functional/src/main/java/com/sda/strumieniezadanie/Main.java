package com.sda.strumieniezadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("Dluga", "12","5", "Bydgoszcz"));
        addresses.add(new Address("Marszałkowska", "5",null, "Warszawa"));
        addresses.add(new Address("Krupówki", "1","23", "Zakopane"));
        addresses.add(new Address("Toruńska", "52","1", "Bydgoszcz"));
        addresses.add(new Address("Bydogska", "52","7", "Toruń"));

        Map<String, List<Address>> map = addresses.stream()
                .collect(Collectors.groupingBy(Address::getCity));

        map.get("Bydgoszcz")
                .stream()
                .map(Address::getStreet)
                .forEach(System.out::println);

        addresses.stream()
                .collect(Collectors.groupingBy(Address::getCity))
                .get("Bydgoszcz")
                .stream()
                .map(Address::getStreet)
                .forEach(System.out::println);


    }
}
