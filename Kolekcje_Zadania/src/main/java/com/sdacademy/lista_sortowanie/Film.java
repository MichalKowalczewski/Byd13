package com.sdacademy.lista_sortowanie;

import java.util.Comparator;

public class Film implements Comparable<Film> {

    private String tytul;
    private int rokProdukcji;

    public Film(String tytul, int rokProdukcji) {
        this.tytul = tytul;
        this.rokProdukcji = rokProdukcji;
    }

    public String getTytul() {
        return tytul;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    @Override
    public String toString() {
        return "Film{ tytul=" + tytul + ", rokProdukcji=" + rokProdukcji + "}";
    }

    @Override
    public int compareTo(Film o) {
        System.out.println(o.tytul.compareTo(this.tytul));
        return o.tytul.compareTo(this.tytul);
    }

    //Tworzymy Comparator ze zdefiniowanym typem Film - za pomocą lambdy implementujemy metodę compare interfejsu Comparator - wartości film1 i film2 są typu Film
    /*public static Comparator<Film> comparatorTytulow = (film1, film2) -> film1.tytul.compareTo(film2.tytul);

    public static Comparator<Film> comparatorRokuProdukcji = (o1, o2) -> o1.rokProdukcji-o2.rokProdukcji;*/

}
