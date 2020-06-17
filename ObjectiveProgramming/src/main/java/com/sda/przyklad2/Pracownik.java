package com.sda.przyklad2;

public class Pracownik extends Osoba {

    public Pracownik(String imie, String nazwisko, int wiek, int pensja) {
        super(imie, nazwisko, wiek);
        this.pensja = pensja;
    }

    private int pensja;

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    //W tym miejscu stosujemy nadpisywanie metody - w tym miejscu tą metodę koniecznie
    //musimy nadpisać, ponieważ nasza klasa rozszerza klasę abstrakcyjną Osoba
    //wewnątrz klasy abstrakcyjnej Osoba jest metoda abstrakcyjna describe()
    //kompilator wymusza na nas zaimplementowanie tej metody w klasie dziedziczącej
    @Override
    public void describe() {
        System.out.println("Jestem Pracownikiem, nazywam się: "+getImie()+" "+getNazwisko()+" i mam "+getWiek()+" lat");
    }
}
