package com.sda.przyklad1;

public class Przyklad {

    //poprzez formułę throws informujemy że metoda może wyrzuić exception a jego obsługę
    //zrzucamy na osobę, która będzie wykorzystywać daną metodę.
    public void test() throws NullPointerException{
        System.out.println("test");
    }

    public void test2() throws ClassNotFoundException{
        System.out.println("test2");
    }

}
