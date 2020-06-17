package com.sda.przyklad3;

import java.time.LocalDate;
import java.util.Date;

//Klasa której wszystkie pola są finalne, i posiada jedynie gettery nazywana
//jest klasą Immutable - są to obiekty, których finalny stan określany
//jest podczas inicjalizacji i przez cały okres życia tego obiektu nie może zostać zmieniony
//w takiej sytuacji jeżeli chcemy wprowadzić jakąkolwiek zmianę, musimy utworzyc nowy obiekt
//Najbardziej znanym przykładem klasy immutable jest String - jakiekolwiek zmiany w Stringu
//powodują powstanie nowego obiektu, a nie zmodyfikowanie istniejącego stringa
//Jeśli chcemy przeprowadzać zmiany na stringach zaleca się stosowanie StringBuffera lub
//StringBuildera
public class Paszport {
    private final String numerPesel;
    private final LocalDate dataWydania;
    private final Osoba wlascicielPaszportu;

    public Paszport(String numerPesel, LocalDate dataWydania, Osoba wlascicielPaszportu) {
        this.numerPesel = numerPesel;
        this.dataWydania = dataWydania;
        this.wlascicielPaszportu = wlascicielPaszportu;
    }

    public String getNumerPesel() {
        return numerPesel;
    }

    public LocalDate getDataWydania() {
        return dataWydania;
    }

    public Osoba getWlascicielPaszportu() {
        return wlascicielPaszportu;
    }
}
