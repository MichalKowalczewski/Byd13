package com.sda.przyklad1;

public class Main {
    public static void main(String[] args) {

        //W tym miejscu wyrażenie lambda tworzy nam implementację metody execute(int a, int b)
        // - nasze zmienne (a,b) to właśnie te atrybuty metody
        //w przypadku braku atrybutów użylibyśmy po prostu (),
        // w sytuacji gdyby atrybut był tylko jeden - np. a, wystarczyło by samo "a ->" bez nawiasu.
        Example example = (a, b) -> a+b;

        //Rezultat jest dokładnie taki sam - jednak jak widać lambdy to 3 razy mniej kodu :)
        Example example1 = new Example() {
            @Override
            public int execute(int a, int b) {
                return a+b;
            }
        };
        //Kiedy nasze wyrażenie lambda jest bardziej złożone i ma więcej niż jedną linijkę,
        // wówczas zamykamy je w klamrach {}
        //dodatkowo jeżeli coś zwraca - musimy to oczywiście zwrócić też -
        // w przypadku jednolinijowego wyrażenia lambda, nie musieliśmy się
        //martwić zwracaniem
        Example example2 = (a, b) -> {
            a=a+b;
            a=a*b;
            return a;
        };

        System.out.println(example2.execute(2,5));

        NewExample newExample = s -> System.out.println(s);
        newExample.display("Wyswietlam tekst");

        //referencja metody - możemy ją zastosować gdy:
        NewExample otherExample = System.out::println;
        otherExample.display("Metoda z porabana skladnia");

        Janusz janusz = new Janusz();

        InterfejsJanusza kolejnyInterfejs = janusz::zrobJanusza;
        kolejnyInterfejs.run("s","s2");
        kolejnyInterfejs = (s, s2) -> janusz.zrobJanusza(s,s2);

    }
}
