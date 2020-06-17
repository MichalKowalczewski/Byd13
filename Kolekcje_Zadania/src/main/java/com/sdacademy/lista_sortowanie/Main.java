package com.sdacademy.lista_sortowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    //3. Zmodyfikuj sortowanie filmów w taki sposób, aby były sortowane w odwrotnej kolejności wykorzystaj interfejs
    // Comparable

    //4. Poszukaj informacji o interfejsie Comparator. Zmień program filmy tak, aby można było je sortować zarówno po
    //tytule jak i po roku produkcji.

    public static void main(String[] args) {

        List<Film> listaFilmow = new ArrayList<>();
        listaFilmow.add(new Film("Pila",2004));
        listaFilmow.add(new Film("Przeminelo z Witarem",1939));
        listaFilmow.add(new Film("Miasteczko Twin Peaks",1990));
        listaFilmow.add(new Film("Amelia",2001));
        listaFilmow.add(new Film("Smerfy",2011));
        listaFilmow.add(new Film("Znachor",1981));

        System.out.println("Filmy przed sortowaniem:");
        for(Film f:listaFilmow){
            System.out.println(f);
        }

        Collections.sort(listaFilmow);

        //Sortujemy listę dając metodzie sort za argument jeden z naszych komparatorów
        //listaFilmow.sort(Film.comparatorTytulow);

        System.out.println("Filmy po sortowaniu:");
        for(Film f:listaFilmow){
            System.out.println(f);
        }


    }

}
