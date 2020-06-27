package com.sda.zadanie3;

public class Kolo implements Figura {

    double r;

    public Kolo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double obliczPole() {
        return 2*Math.PI*r;
    }

    @Override
    public double obliczObwod() {
        return Math.PI*Math.pow(r,2);
    }
}
