package com.sda.zadanie2;

public class Main {
    public static void main(String[] args) {
        Samolot boeing = new Samolot() {
            @Override
            String getName() {
                return "Boeing";
            }
        };
        Samolot airbus = new Samolot() {
            @Override
            String getName() {
                return "Airbus";
            }
        };
        Samolot mig = new Samolot() {
            @Override
            String getName() {
                return "MIG";
            }
        };

        System.out.println(boeing.getName());
        System.out.println(airbus.getName());
        System.out.println(mig.getName());
    }
}
