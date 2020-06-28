package com.sdacademy.watki.kontobankowe;

public class KlientKonta implements Runnable {

    private Konto konto;

    public KlientKonta(Konto konto) {
        this.konto = konto;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            konto.wyplacKwote(5);
            konto.wyswietlStanKonta();
        }
    }
}
