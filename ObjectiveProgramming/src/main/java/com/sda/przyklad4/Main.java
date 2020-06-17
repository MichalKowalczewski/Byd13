package com.sda.przyklad4;

public class Main {
    public static void main(String[] args) {
        Postac postac = new Mag();
        Postac postac2 = new Wojownik();

        System.out.println(Postac.LOKACJA_STARTOWA);

        postac.walcz();
        postac2.walcz();

        System.out.println("Mag metoda defualt: "+postac.nazwaInterfejsu());
        System.out.println("Wojownik metoda defualt: "+postac2.nazwaInterfejsu());

        System.out.println(postac.iloscPunkowZycia());

        ZywyObiekt zywyObiekt = new Mag();

        zywyObiekt.umrzyj();

    }
}
