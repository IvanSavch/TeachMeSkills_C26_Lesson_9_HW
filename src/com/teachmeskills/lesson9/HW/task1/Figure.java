package com.teachmeskills.lesson9.HW.task1;

public sealed abstract class Figure permits Circle,Rectangle,Triangle  {
    public abstract void printSquare();
    public abstract int printPerimeter();
}
