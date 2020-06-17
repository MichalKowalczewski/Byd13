package com.sda.przyklad1;

public class Zwierze {
    //To co tu robimy nazywa się enkapsulacją.
    //Enkapsulacja (inaczej hermetyzacja) to ukrywanie widoczności
    // pól danej klasy dla innych klas, co w ten sposób chroni dane przechowywane
    // w tych polach przed niepowołanym, lub co najmniej nieuzasadnionym dostępem.
    private int iloscŁap;

    public Zwierze(int iloscŁap) {
        this.iloscŁap = iloscŁap;
    }

    public int getIloscŁap() {
        return iloscŁap;
    }

    public void setIloscŁap(int iloscŁap) {
        this.iloscŁap = iloscŁap;
    }
}
