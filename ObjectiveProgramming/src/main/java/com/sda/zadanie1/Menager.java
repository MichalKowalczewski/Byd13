package com.sda.zadanie1;

public class Menager extends Pracownik {

    private Pracownik[] podlegliPracownicy;

    public Menager(String imie, String nazwisko, int wiek, int pensja) {
        super(imie, nazwisko, wiek, pensja);
    }

    public Pracownik[] getPodlegliPracownicy() {
        return podlegliPracownicy;
    }

    public void setPodlegliPracownicy(Pracownik[] podlegliPracownicy) {
        this.podlegliPracownicy = podlegliPracownicy;
    }

    //W tym miejscu nadpisujemy metodę describe, pochodzącą z klasy Pracownik
    //nie musimy tego robić tak jak w przypadku klasy Pracownik, ponieważ klasa Pracownik
    //już zaimplementowała tą metodę, jednakże jeżeli chcemy zmienić implementację tej metody
    //w naszej nowej klasie - to mamy taką możliwość.
    @Override
    public void describe() {
        System.out.println("Jestem Menagerem, nazywam się: "+getImie()+" "+getNazwisko()+" i mam "+getWiek()+" lat");
    }
}
