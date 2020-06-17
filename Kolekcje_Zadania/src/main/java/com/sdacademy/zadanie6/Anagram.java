package com.sdacademy.zadanie6;

import java.util.Map;
import java.util.TreeMap;

public class Anagram {
    //Tworzymy 2 mapy słów, gdzie kluczem jest znak, a wartością ilość wystąpień
    Map<Character, Integer> mapaSlowa1 = new TreeMap<Character, Integer>();
    Map<Character, Integer> mapaSlowa2 = new TreeMap<Character, Integer>();

    //Tworzymy metodę sprawdzająca czy 2 słowa są anagramami
    public boolean anagramCheck(String slowo1, String slowo2 ){

        //Zapełniamy obie listy znakami ze słów
        mapaSlowa1 = fillMapaSlow(mapaSlowa1, slowo1);
        mapaSlowa2 = fillMapaSlow(mapaSlowa2, slowo2);

        //Sprawdzamy czy mapy są tej samej wielkości, jeśli nie są - słowa nie mogą być anagramami
        if (mapaSlowa1.size() != mapaSlowa2.size()){
            System.out.println("Słowa są różnej długości");
            return false;
        }

        //Iterujemy przez mapę pierwszego słowa
        for(Map.Entry entry:mapaSlowa1.entrySet()){
            //Przypisujemy ilość wystąpień literki do zmiennej
            int iloscPierwsze = (Integer) entry.getValue();
            //sprawdzamy czy mapa drugiego słowa zawiera w swoich kluczach literkę, do której własnie odwołujemy się w aktualnej iteracji
            if(mapaSlowa2.containsKey(entry.getKey())){
                //pobieramy ilość wystąpień literki w drugim słowie, na podstawie klucza ze słowa pierwszego
                int iloscDrugie = mapaSlowa2.get(entry.getKey());

                //Wyświetlamy ilość wystąpień
                System.out.println("Litera " +entry.getKey()+" występuje " +iloscPierwsze + " razy w pierwszym słowie");
                System.out.println("Litera " +entry.getKey()+" występuje " + mapaSlowa2.get(entry.getKey()) + " razy w drugim słowie");
                System.out.println("***");
                //Sprawdzamy czy ilość wystąpień danej litery jest taka sama w obu słowach - jeśli nie jest - słowa nie są anagramami
                if(iloscPierwsze != iloscDrugie){
                    System.out.println("Litera: " + entry.getKey() + " nie występuje w takiej samej ilości w obu słowach");
                    return false;
                }
            }
            else {
                //Jeśli litera nie występuje w drugim słowie to nie są one anagramami
                System.out.println("Litera: " + entry.getKey() + " nie występuje w drugim słowie");
                return false;
            }
        }
        //Jeśli żaden z negatywnych warunków nie został spełniony - słowa są anagramami
        return true;
    }

    public Map<Character, Integer> fillMapaSlow(Map<Character, Integer> mapaSlowa, String slowo){
        //Iterujemy po literkach, przekształcając stringa na tablicę Charów
        for(Character c: slowo.toCharArray()){
            //Sprawdzamy czy klucz występuje, jeśli nie - to dodajemy go wraz z 1 wystąpieniem
            if (mapaSlowa.get(c) == null) {
                mapaSlowa.put(c, 1);
            }
            else {
                //Jeśli klucz występuje to zwiększamy jego wartość o 1
                mapaSlowa.put(c, mapaSlowa.get(c)+1);
            }
        }
        return mapaSlowa;
    }


}
