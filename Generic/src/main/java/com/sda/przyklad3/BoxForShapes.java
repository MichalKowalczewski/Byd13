package com.sda.przyklad3;

public class BoxForShapes<T extends Shape> {

    private T[] shapes;

    public BoxForShapes(T[] shapes) {
        this.shapes = shapes;
    }

    public double sumOfCircuits() {
        double sum = 0.0;
        for (T shape : shapes)
            sum += shape.circuit();

        return sum;
    }
}
