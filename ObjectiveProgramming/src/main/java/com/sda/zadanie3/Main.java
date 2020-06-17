package com.sda.zadanie3;

public class Main {
    public static void main(String[] args) {
        Figura figura = new Kolo(5);
        System.out.println(figura.obliczObwod());
        System.out.println(figura.obliczPole());
    }
}
