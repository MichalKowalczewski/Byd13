package com.sda.strumienie.przyklad1;

import com.sda.strumienie.przyklad1.model.Samochod;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Samochod> auta = Arrays.asList(
                new Samochod("Mazda RX8", 125, 16900,186000),
                new Samochod("Fiat Punto", 69, 28900, 31500),
                new Samochod("Ford Mustang", 320, 59999, 94000));

        for(Samochod a : auta){
            if(a.getMocKM()>100){
                if(a.getPrzebieg() < 200000){
                    if(a.getCena()<30000){
                        System.out.println(a.getNazwa().toUpperCase());
                    }
                }
            }
        }

        auta.stream()
                .filter(a -> a.getMocKM() >100)
                .filter(a -> a.getPrzebieg() <200000)
                .filter(a -> a.getCena() < 30000)
                .map(a -> a.getNazwa().toUpperCase())
                .forEach(System.out::println);
    }
}
