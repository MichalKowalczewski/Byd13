package com.sda.przyklad3;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double circuit(){
        return 2*Math.PI* radius;
    }
}
