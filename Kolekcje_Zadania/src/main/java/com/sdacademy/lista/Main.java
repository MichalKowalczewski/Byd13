package com.sdacademy.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jan");
        list.add("Stefan");
        list.add("Marian");
        list.add("Bożena");
        list.add("Eugeniusz");

        //o tym jeszcze pogadamy
        //list.forEach(s -> System.out.println(s));

        for(String s:list){
            System.out.println(s);
        }

        list.remove(1);

        System.out.println("______________");
        System.out.println("Po usunięciu 1:");
        for (String s:list){
            System.out.println(s);
        }

        list.remove("Marian");
        System.out.println("______________");
        System.out.println("Po usunięciu Mariana:");
        for (String s:list){
            System.out.println(s);
        }

        System.out.println("______________");
        System.out.println("Czy zawiera Jana?");
        System.out.println(list.contains("Jan"));


        System.out.println("______________");
        System.out.println("Pod dodaniu tablicy:");
        String[] imiona = {"Elżbieta","Genowefa", "Robert"};
        list.addAll(1,Arrays.asList(imiona));
        for (String s:list){
            System.out.println(s);
        }

        System.out.println("____________");
        List<Integer> listaLiczb = new ArrayList<>();
        listaLiczb.add(5);
        listaLiczb.add(1);
        listaLiczb.add(3);
        listaLiczb.add(2);

        List<Integer> listaLiczb2 = new ArrayList<>();
        listaLiczb2.add(5);
        listaLiczb2.add(1);
        listaLiczb2.add(3);
        listaLiczb2.add(2);

        System.out.println("Czy są równe?");
        System.out.println(listaLiczb.equals(listaLiczb2));

    }
}
