package com.sda.strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Samochod> auta = Arrays.asList(
                new Samochod("Mazda RX8", 125, 16900, 186000),
                new Samochod("Fiat Punto", 102, 28900, 31500),
                new Samochod("Multipla", 320, 59999, 94000));

        for (Samochod a:auta){
            if (a.getMocKM()>100){
                if (a.getPrzebieg()< 100000){
                    if (a.getCena() < 30000){
                        System.out.println(a.getNazwa().toLowerCase());
                    }
                }
            }
        }

        /*List<String> poStreamie = auta.stream()
                .filter(samochod -> samochod.getMocKM() > 100)
                .filter(samochod -> samochod.getPrzebieg() < 100000)
                .filter(samochod -> samochod.getCena() <30000)
                .collect(Collectors.groupingBy())
                .collect(Collectors.toList());


        poStreamie.forEach(samochod -> System.out.println(samochod));*/


    }
}
