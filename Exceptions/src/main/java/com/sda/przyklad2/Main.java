package com.sda.przyklad2;

public class Main {
    public static void main(String[] args) {
        Operacja operacja = new Operacja();
        try {
            operacja.operuj();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("Kauteryzacja");
        }
        finally {
            System.out.println("Koniec operacji");
        }
    }
}
