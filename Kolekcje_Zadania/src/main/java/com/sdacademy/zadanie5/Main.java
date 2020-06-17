package com.sdacademy.zadanie5;

//2. Wczytuj (Scanner) od użytkownika liczby tak długo, aż wpisze on -1. Wypisz najmniejszą z nich.
//Liczby zapamiętuj na liście.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listaLiczb = new ArrayList<Integer>();
        int liczba;
        //Tworzymy komparator, do sortowania listy od najmniejszej do największej wartości
        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                //Jeśli wartość wyjdzie ujemna, pierwsza porównywana liczba jest przesuwana w kierunku początku listy
                return o1 - o2;
            }
        };
        //tworzymy pętle nieskończoną
        while (true){
            System.out.println("Podaj liczbę");
            try {
                //Pobieramy liczbę od użytkownika - stosujemy nextLine, ponieważ nextInt powodował nam nieskończne iteracje pętli.
                liczba = Integer.parseInt(scanner.nextLine());
                if (liczba != -1) {
                    listaLiczb.add(liczba);
                }
                //Jeśli liczba będzie równa -1 przerywamy pętlę
                else {
                    break;
                }
            }
            //Jeśli wprowadzona zostanie wartość tekstowa, program poprosi nas o wprowadzenie poprawnej wartości liczbowej
            catch (NumberFormatException e){
                System.out.println("Wprowadź liczbę, nie tekst");
            }
        }
        //Sortujemy listę z wykorzystaniem utworzonego uprzednio comparatora
        listaLiczb.sort(comparator);
        //Wypisujemy pierszą pozycję z listy
        System.out.println(listaLiczb.get(0));
    }
}
