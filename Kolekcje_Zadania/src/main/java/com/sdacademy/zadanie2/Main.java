package com.sdacademy.zadanie2;
//7. Utwórz klasę Pracownik (imie, nazwisko, stanowisko). Dodaj 5 pracowników do zbioru. Usuń z niego dwóch pierwszych
//dodanych pracowników. Wyświetl zawartość zbioru.

import com.sdacademy.zadanie2.model.Pracownik;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List<Pracownik> listaPracowników = new ArrayList<>();

        listaPracowników.add(new Pracownik("Jan", "Kowalski", "Inżynier"));
        listaPracowników.add(new Pracownik("Edward", "Nowak", "Programista"));
        listaPracowników.add(new Pracownik("Stefan", "Jakikolwiek", "Nic nie robi"));
        listaPracowników.add(new Pracownik("Kolejny", "Gość", "Sprzątacz"));
        listaPracowników.add(new Pracownik("Jan", "Nowak", "Lopatowy"));

        listaPracowników.remove(0);
        listaPracowników.remove(0);

        for (Pracownik pracownik : listaPracowników){
            System.out.println(pracownik.getImie() + " " +pracownik.getNazwisko() + " "+pracownik.getStanowisko());
        }

    }
}
