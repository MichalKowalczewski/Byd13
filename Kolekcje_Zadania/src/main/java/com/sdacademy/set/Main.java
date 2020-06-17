package com.sdacademy.set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> zbiorNapisow = new HashSet();
        zbiorNapisow.add("napis1");
        zbiorNapisow.add("napis2");
        zbiorNapisow.add("napis1");
        System.out.println("Ilosc napisow w zbiorze: "+zbiorNapisow.size());
        for (String napis: zbiorNapisow){
            System.out.println(napis);
        }

        String zdanie="Jestem programista Javy";
        Set<Character> literkiUzyteWzdaniu = new HashSet<>();
        for(int i=0;i<zdanie.length();i++){
            literkiUzyteWzdaniu.add(zdanie.charAt(i));
        }
        System.out.println("Literki uzyte w zdaniu: "+zdanie);
        for (char literka: literkiUzyteWzdaniu){
            System.out.println(literka);
        }

        Set<Osoba> osoby = new HashSet<>();
        osoby.add(new Osoba("Jan","Kowalski"));
        osoby.add(new Osoba("Adam","Nowak"));
        osoby.add(new Osoba("Marian","Nowicki"));
        osoby.remove(new Osoba("Jan","Kowalski"));
        for (Osoba osoba: osoby){
            System.out.println(osoba);
        }
        System.out.println("Czy Adam Nowak jest w zbiorze ? "
                +osoby.contains(new Osoba("Adam","Nowak")));
    }
}
