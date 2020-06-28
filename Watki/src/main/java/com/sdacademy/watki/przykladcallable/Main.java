package com.sdacademy.watki.przykladcallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //Inne watki dzialaja niezalezni od naszego watku, stad trudno przewidziec kiedy otrzymamy wynik ich dzialania.
        //Interfejs Future sluzy do pobierania przyszlych wynikow watkow.
        List<Future<String>> listaPrzyszlychNapisow = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Future<String> przyszlyNapis = executorService.submit(new LosowyNapis());
            listaPrzyszlychNapisow.add(przyszlyNapis);
        }
        executorService.shutdown();

        for (Future<String> przyszlyNapis : listaPrzyszlychNapisow) { //iterujemy po liście naszych Future'ów
            try {
                //metoda get zwróci wartość naszego Future'a o ile już się pojawiła.
                //W przeciwnym wypadku będzie czekać na jej pojawienie. Dopiero wtedy program ruszy dalej.
                String napis = przyszlyNapis.get();
                System.out.println(napis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}


