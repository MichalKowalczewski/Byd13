package com.sda.funkcyjne.przyklad1;

public class Main {
    public static void main(String[] args) {
        //W tym miejscu wyrażenie lambda tworzy nam implementację metody execute(int a, int b) - nasze zmienne (a,b) to właśnie te atrybuty metody
        //w przypadku braku atrybutów użylibyśmy po prostu (), w sytuacji gdyby atrybut był tylko jeden - np. a, wystarczyło by samo "a ->" bez nawiasu.
        Example example = (a, b) -> a+b;
        //LUB klasa anonimowa
        Example example1 = new Example() {
            @Override
            public int execute(int a, int b) {
                return a+b;
            }
        };
        //Rezultat jest dokładnie taki sam - jednak jak widać lambdy to 3 razy mniej kodu :)
        System.out.println(example.execute(3,5));

        //Kiedy nasze wyrażenie lambda jest bardziej złożone i ma więcej niż jedną linijkę, wówczas zamykamy je w klamrach {}
        //dodatkowo jeżeli coś zwraca - musimy to oczywiście zwrócić też - w przypadku jednolinijowego wyrażenia lambda, nie musieliśmy się
        //martwić zwracaniem
        example = (a, b) -> {
            a=a+b;
            a=a*b;
            return a;
        };

        System.out.println(example.execute(4,6));

        example.display();

        //Klasa anonimowa zadziała, ale lambda już nie - ponieważ OtherExample nie jest interfejsem funkcyjnym
        OtherExample otherExample = new OtherExample() {
            @Override
            public void execute() {

            }

            @Override
            public String display() {
                return null;
            }
        };

        //Mamy tylko 1 atrybut, nie musimy stosować nawiasów
        YetAnotherExample yetAnotherExample = s -> System.out.println("Wyświetlam tekst i naszą zmienną: "+s);
        yetAnotherExample.doSomeMagic("taki sobie tekst");
        //Tu następuje składniowe szaleństwo :) - jest to tzw referencja metody możemy ją zastosować gdy:
        //argument wejściowy lambdy jest argumentem metody z pewnej klasy
        //LUB
        //na argumencie wejściowym wywoływana jest bezargumentowa metoda. Więcej przykładów będzie niżej
        yetAnotherExample = System.out::println;
        yetAnotherExample.doSomeMagic("Całkiem porąbana składnia :P");
        //Z racji że ta metoda nie zwraca żadnego typu (jest void) to nie musimy stosować return, ale oczywiście z racji że wyrażenie jest bardziej
        //skomplikowane - to musimy zastosować klamry {}
        yetAnotherExample = s -> {
            System.out.println("Troche tekstu tu");
            System.out.println(s);
        };
        yetAnotherExample.doSomeMagic("Ostatni tekst");

        Janusz janusz = new Janusz();

        yetAnotherExample = String::toUpperCase;
        yetAnotherExample = janusz::zrobJanusza;
        yetAnotherExample.doSomeMagic("aaa");

    }
}
