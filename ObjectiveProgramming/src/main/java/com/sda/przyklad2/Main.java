package com.sda.przyklad2;

//Dziedziczenie klasy abstrakcyjne, metody abstrakcyjne, nadpisywanie metod, Polimorfizm
public class Main {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Jan", "Kowalski", 28, 2000);
        pracownik.describe();

        Pracownik menadżer = new Manager("Andrzej", "Nowak", 40, 7000);
        menadżer.describe();

        Osoba programista = new Programista("Maria", "Curie", 120, 12000);
        programista.describe();

        Pracownik castowanyPracownik = new Manager("Adam", "Malysz",40,5000);
        //Menadżer castowanyMenager = castowanyMenager;
        String sprawdz = castowanyPracownik instanceof Manager ? "menadzer" : "nie menadzer";
        System.out.println(sprawdz);
        Manager castowanyManager = (Manager) castowanyPracownik;
        castowanyManager.describe();
    }
}
