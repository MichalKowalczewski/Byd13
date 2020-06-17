package com.sda.przyklad5;

public class Main {
    public static void main(String[] args) {
        //Klasę lokalną można zadeklarować wewnątrz metody - wówczas klasa ta jest dostępna
        //jedynie wewnątrz tej metody
        class LocalClass{
            public void displayText(){
                System.out.println("Zawartość LocalClass");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.displayText();

        OuterClass outerClass = new OuterClass();
        outerClass.display();
        outerClass.displayInner();

        //Klasa anonimowa to klasa, której implementacje tworzymy w momencie deklaracji,
        //dana implementacja wykorzystywana jest w formie jednorazowej potrzeby.
        Anonymous anonymous = new Anonymous() {
            @Override
            public void display() {
                System.out.println("Klasa Anonimowa");
            }
        };
        anonymous.display();
    }
}
