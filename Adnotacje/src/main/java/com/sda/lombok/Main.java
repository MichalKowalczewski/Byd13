package com.sda.lombok;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski");

        System.out.println(person.getFirstName() + " "+person.getLastName());
    }
}
