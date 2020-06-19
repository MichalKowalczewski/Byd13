package com.sda.strumienie.zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//Utwórz klasę Address z polami - street, buildingNo, aptNo i city.
//Stwórz listę Addressów, wypełnij ją przykładowymi 5 adresami, niech 2 z adresów mają w polu city Bydgoszcz.
//za pomocą strumienia, pogrupuj adresy po miastach a następnie z powstałej kolekcji, używając metody map() i forEach() wypisz ulice adresów znajdujących się w Bydgoszczy


public class Main {
    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("Dluga", "12","5", "Bydgoszcz"));
        addresses.add(new Address("Marszałkowska", "5",null, "Warszawa"));
        addresses.add(new Address("Krupówki", "1","23", "Zakopane"));
        addresses.add(new Address("Toruńska", "52","1", "Bydgoszcz"));
        addresses.add(new Address("Bydogska", "52","7", "Toruń"));

        addresses.stream()
                .collect(Collectors.groupingBy(Address::getCity))
                .get("Bydgoszcz")
                .stream()
                .map(Address::getStreet)
                .forEach(System.out::println);

    }
}
