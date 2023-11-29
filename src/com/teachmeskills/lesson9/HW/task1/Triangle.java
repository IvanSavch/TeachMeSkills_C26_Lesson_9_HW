package com.teachmeskills.lesson9.HW.task1;

public non-sealed class Triangle extends Figure {
    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void printSquare() {
        if ((sideA < 0) || (sideB < 0) || (sideC < 0)) {
            System.out.println("wrong input");
            return;
        }
        int p = (sideA + sideB + sideC) / 2;
        double squareOfTheTriangle = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        System.out.println(squareOfTheTriangle);
    }

    @Override
    public int printPerimeter() {
        if ((sideA < 0) || (sideB < 0) || (sideC < 0)) {
            return -1;
        }
        return sideA + sideB + sideC;
    }
}
