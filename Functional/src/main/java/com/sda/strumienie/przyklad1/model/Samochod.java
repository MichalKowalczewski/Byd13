package com.sda.strumienie.przyklad1.model;

public class Samochod{
    private final String nazwa;
    private final double mocKM;
    private final double cena;
    private final double przebieg;

    public Samochod(String nazwa, double mocKM, double cena, double przebieg){
        this.nazwa = nazwa;
        this.mocKM = mocKM;
        this.cena = cena;
        this.przebieg = przebieg;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getMocKM() {
        return mocKM;
    }

    public double getCena() {
        return cena;
    }

    public double getPrzebieg() {
        return przebieg;
    }
}