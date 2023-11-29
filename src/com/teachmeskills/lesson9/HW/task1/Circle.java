package com.teachmeskills.lesson9.HW.task1;

public non-sealed class Circle extends Figure{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void printSquare() {
        double squareOfTheCircle = Math.PI * Math.pow(radius, 2);
        System.out.println(squareOfTheCircle);
    }

    @Override
    public int printPerimeter() {
        if (radius < 0) {
            return -1;
        }
        double P = 2 * Math.PI * radius;
        return (int) P;
    }
}
