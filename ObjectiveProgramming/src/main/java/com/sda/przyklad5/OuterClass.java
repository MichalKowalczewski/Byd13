package com.sda.przyklad5;

public class OuterClass {

    private String testPola="testPola";

    //Możemy także deklarować klasę wewnątrz klasy. Wówczas klasa wewnętrzna jest dostępna
    //wewnątrz tej klasy - chyba że uczynimy naszą klasę zewnętrzną klasą statyczną.
    //Klasa wewnętrzna ma dostęp do metod i pól klasy zewnętrznej - nawet tych prywatnych.
    public class InnerClass{
        public void display(){
            System.out.println("InnerClass");
            test();
            System.out.println(testPola);
        }
    }

    public void displayInner(){
        InnerClass innerClass = new InnerClass();
        innerClass.display();
    }

    public void display(){
        System.out.println("OuterClass");
    }

    public void test(){
        System.out.println("test");
    }
}
