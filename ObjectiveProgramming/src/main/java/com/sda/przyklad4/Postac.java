package com.sda.przyklad4;

import java.util.Random;

//Dla odmiany, interfejsy nie implementują innych interfejsów lecz je rozszerzają
public interface Postac extends ZywyObiekt {

    //Pola interfejsów są zawsze statyczne (static), domyślne (default) i publiczne (public)
    String LOKACJA_STARTOWA = "Tawerna";

    //Wszystkie metody interfejsu są domyślnie publiczne (public) i abstrakcyjne (abstract)
    //nie implementujemy ich ciał
    void walcz();

    //Metoda domyślna może mieć zaimplementowane ciało metody - może być przeciążona w klasie
    //która implementuje nasz interfejs
    default String nazwaInterfejsu(){
        return "Postac";
    }

    default int iloscPunkowZycia(){
        return wygenerujPz();
    }

    //metody prywatne mogą mieć ciała wewnątrz interfejsów - nie mogą być jednak odczytywane
    //poza interfejsem, tak więc jedynym sensownym wykorzystaniem metod prywatnych w
    //interfejsie, to użycie ich w metodach domyślnych, aby np uniknąć duplikowania kodu.
    private int wygenerujPz(){
        Random random = new Random();
        //Szukamy wartości między 6 a 10 :P
        //10 to maksymalna wartość, 6 to minimalna - random generuje liczby podobnie jak
        //indeksujemy tablice-tak więc w przypadku bound = 5-liczby będą generowane od 0 do 4
        //w tym przypadku losujemy liczbę od 0 do 4 i zawsze dodajemy do niej 6 - czyli
        //zakres będzie 6-10
        return  random.nextInt((10-6)+1)+6;
    }

}
