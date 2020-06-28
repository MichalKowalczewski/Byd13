package com.sda.przyklad3;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {new Square(3), new Circle(9), new Square(5)};
        Square[] squares = {new Square(8), new Square(7)};
        Circle[] circles = {new Circle(4), new Circle(5)};

        BoxForShapes<Shape> boxForShapes = new BoxForShapes<>(shapes);
        BoxForShapes<Square> boxForSquares = new BoxForShapes<>(squares);
        BoxForShapes<Circle> boxForCircles = new BoxForShapes<>(circles);

        System.out.println("Suma obwodow ksztaltow: " + boxForShapes.sumOfCircuits());
        System.out.println("Suma obwodow kwadratow: " + boxForSquares.sumOfCircuits());
        System.out.println("Suma obwodow okregow: " + boxForCircles.sumOfCircuits());




   }
}
