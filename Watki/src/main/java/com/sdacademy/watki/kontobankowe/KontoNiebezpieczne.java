package com.sdacademy.watki.kontobankowe;

public class KontoNiebezpieczne implements Konto{

    private int saldo;
    private String watek;

    public KontoNiebezpieczne(int saldo) {
        this.saldo = saldo;
    }

    public void wyplacKwote(int kwota) {
        if (saldo >= kwota) {
            watek = Thread.currentThread().getName();
            System.out.println("Watek: "+watek+" Wyplacam z konta kwote: " + kwota);
            saldo = saldo - kwota;
        }
        else
        {
            System.out.println("Watek: "+Thread.currentThread().getName()+" Nie moge wyplacic, brak pieniedzy!");
        }
    }

    public void wplacKwote(int kwota) {
        System.out.println("Watek: "+Thread.currentThread().getName()+" Wplacam na konto kwote: " + kwota);
        saldo = saldo + kwota;
    }

    public void wyswietlStanKonta() {
        System.out.println("Watek: "+Thread.currentThread().getName()+" Stan konta: " + saldo);
    }

    public int getSaldo() {
        return saldo;
    }
}
