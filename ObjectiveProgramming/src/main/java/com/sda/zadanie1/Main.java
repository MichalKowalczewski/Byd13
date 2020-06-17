package com.sda.zadanie1;

//Dziedziczenie klasy abstrakcyjne, metody abstrakcyjne, nadpisywanie metod, Polimorfizm
public class Main {
    public static void main(String[] args) {

        Pracownik[] pracownicy =
                new Pracownik[]{
                        new Pracownik("Jan", "Nowak", 26,2000),
                        new Menager("Anna", "Kowalska", 40, 6000),
                        new Programista("Stefan", "Jakistam", 30, 6000),
                        new ProgramistaSenior("Marian", "Wymyslam", 38, 9000)
                };

        Menager menager = new Menager("Elzbieta", "Menagerska", 45, 12000);

        menager.setPodlegliPracownicy(pracownicy);

        menager.describe();
        System.out.println("Podlegaja mi nastepujący pracownicy: ");
        for (Pracownik pracownik : menager.getPodlegliPracownicy()){
            pracownik.describe();
        }

    }
}
