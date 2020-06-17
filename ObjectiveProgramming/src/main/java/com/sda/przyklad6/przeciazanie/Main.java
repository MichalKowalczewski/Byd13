package com.sda.przyklad6.przeciazanie;

public class Main {
    public static void main(String[] args) {
        short a = 2;
        PrzykladowaKlasa przykladowaKlasa = new PrzykladowaKlasa();
        przykladowaKlasa.display();
        przykladowaKlasa.display(1);
        przykladowaKlasa.display(1.0);
        przykladowaKlasa.display(new Double(1.0));
        przykladowaKlasa.display(1,2);
        przykladowaKlasa.display((short)2);
        przykladowaKlasa.display(a);
        przykladowaKlasa.display((byte) 2);
    }
}
