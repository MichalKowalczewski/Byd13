package com.sdacademy.zadanie6;

public class Main {
    public static void main(String[] args) {

        Anagram anagram = new Anagram();

        if(anagram.anagramCheck("testz", "settz")){
            System.out.println("Jest Anagramem");
        }
        else
            System.out.println("Nie jest Anagramem");

    }
}
