package com.teachmeskills.lesson9.HW.task1;

public non-sealed class Rectangle extends Figure {
    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    public void printSquare() {
        int squareOfTheRectangle = sideA * sideB;
        System.out.println(squareOfTheRectangle);
    }

    @Override
    public int printPerimeter() {
        if ((sideA < 0) || (sideB < 0)) {
            return -1;
        }
        return (sideA * 2) + (sideB * 2);
    }
}
