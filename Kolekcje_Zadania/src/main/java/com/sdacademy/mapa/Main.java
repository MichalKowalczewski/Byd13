package com.sdacademy.mapa;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //mapa imie->wiek
        Map<String, Integer> imionaWiek = new HashMap<>();
        imionaWiek.put("Adam", 11);
        imionaWiek.put("Paweł", 65);
        imionaWiek.put("Ola", 23);
        imionaWiek.put("Agnieszka", 43);
        imionaWiek.put("Paweł", 42);
        System.out.println(imionaWiek);

        Map<String, List<String>> mapaStanowiskProcownicy = new HashMap<>();
        List<String> hydraulicy = new ArrayList<>();
        hydraulicy.add("Stefan");
        hydraulicy.add("Mateusz");
        hydraulicy.add("Alfred");
        mapaStanowiskProcownicy.put("hydraulicy", hydraulicy);
        List<String> mechanicy = new ArrayList<>();
        mechanicy.add("Karol");
        mechanicy.add("Adam");
        mapaStanowiskProcownicy.put("mechanicy", mechanicy);
        System.out.println(mapaStanowiskProcownicy);

        //mapa wystapien slow
        String zdanie = "Jestem programista" +
                " programista jezyka Java" +
                " Java jest modnym jezykiem";
        List<String> wyrazy = Arrays.asList(zdanie.split("\\s"));
        System.out.println(wyrazy);

        Map<String, Integer> liczbaWystapienWyrazu = new HashMap<>();
        for (String wyraz : wyrazy) {
            if (liczbaWystapienWyrazu.containsKey(wyraz)) {
                liczbaWystapienWyrazu.put(wyraz, liczbaWystapienWyrazu.get(wyraz) + 1);
            } else {
                liczbaWystapienWyrazu.put(wyraz, 1);
            }
        }
        System.out.println(liczbaWystapienWyrazu);
    }
}
