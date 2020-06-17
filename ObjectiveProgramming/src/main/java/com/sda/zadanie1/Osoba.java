package com.sda.zadanie1;


//Klasa abstrakcyjna to klasa którą można nazwać "wzorcem" dla innych klas
//Nie możemy utworzyć jej instacji, możemy natomiast tworzyć instancje klas ją dziedziczących
//w klasie abstrakcyjnej można także tworzyć metody abstrakcyjne, o których informację są
//poniżej
public abstract class Osoba {

    private String imie;
    private String nazwisko;
    private int wiek;

    //String nazwisko;
    //protected int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    //metoda describe() została oznaczona jako abstrakcyjna - to oznacza że nie możemy
    //zaimplementować jej ciała, będzie to musiała zrobić natomiast klasa która będzie
    //dziedziczyć po klasie Osoba (chyba że klasa dziedzicząca też będzie klasą abstrakcyjną)
    public abstract void describe();
}
