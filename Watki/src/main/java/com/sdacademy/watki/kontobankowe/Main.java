package com.sdacademy.watki.kontobankowe;

public class Main {

    //Przykład na synchronized

    public static void main(String[] args) {

        Konto konto = new KontoNiebezpieczne(20);
        //Konto konto = new KontoBezpieczne(20);

        KlientKonta klientKonta1 = new KlientKonta(konto);
        KlientKonta klientKonta2 = new KlientKonta(konto);

        Thread watek1 = new Thread(klientKonta1, "watek1");
        Thread watek2 = new Thread(klientKonta2, "watek2");

        watek1.start();
        watek2.start();
    }


}
