package com.sda.przyklad3;

public class Square extends Shape {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double circuit(){
        return 4* sideLength;
    }
}
