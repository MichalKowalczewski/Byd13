package com.sdacademy.watki.kontobankowe;

public interface Konto {
    void wyplacKwote(int kwota);

    void wplacKwote(int kwota);

    void wyswietlStanKonta();

    int getSaldo();
}
