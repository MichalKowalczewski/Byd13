package com.sda.zadanie3;

public class Prostokat extends Kwadrat {
    private double h;

    public Prostokat(double a, double h) {
        super(a);
        this.h = h;
    }

    @Override
    public double obliczPole() {
        return getA()* h;
    }

    @Override
    public double obliczObwod() {
        return 2*(getA()+h);
    }
}
