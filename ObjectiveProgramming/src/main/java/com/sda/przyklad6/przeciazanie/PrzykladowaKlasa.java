package com.sda.przyklad6.przeciazanie;

public class PrzykladowaKlasa {

    public void display(){
        System.out.println("zwykły display");
    }
    /* tak nie wolno
    public String display(){
        return "test";
    }*/

    public void display(int a){
        System.out.println("Wyswietla int a: "+a);
    }

    /*public void display(short a){
        System.out.println("Wyswietl short a: "+a);
    }*/

    public void display(byte a){
        System.out.println("Wyswietl byte a: "+a);
    }

    public void display(double a){
        System.out.println("Wyswietl a z double: "+a);
    }

    public void display(Double a){
        System.out.println("Wyswietl a z Wrapperem: "+a);
    }

    public void display(int a, int b){
        System.out.println("Wyswietl a: "+a+" i b: "+b);
    }
}
