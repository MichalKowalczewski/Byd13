package com.sda.przyklad1;

//Lista wszystkich exceptionów w pakietach JAVA - jak by ktoś potrzebował... do czegokolwiek
//https://programming.guide/java/list-of-java-exceptions.html

public class Main {
    public static void main(String[] args) {
        String text = null;
        //System.out.println(text.charAt(0));
        try {
            System.out.println(text.charAt(0));
        }
        //NullPointerException dziedziczy po klasie RuntimeException (co oznacza że jest tzw
        //unchecked exception - i nie trzeba go obsługiwać.
        catch (NullPointerException e){
            System.out.println("Nie można odwoływać się do pól i metod obiektów, które są nullami");
        }

        Przyklad przyklad = new Przyklad();

        przyklad.test();
        //przyklad.test2();


    }
}
