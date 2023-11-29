package com.teachmeskills.lesson9.HW.task1.task2;

import com.teachmeskills.lesson9.HW.task1.task2.utils.Util;

import java.util.Arrays;

/**
 * Complete the problem from homework number 5.
 * Multiplying two matrices Create two 3x3 arrays of integers (two matrices).
 * Write a program to multiply two matrices.
 * First array: {{1,0,0,0},{0,1,0,0},{0,0,0,0}} Second array: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Expected result: 1 2 3 1 1 1 0 0 0 Create a Utils class.
 * In this class, create a static method to print the matrix on the screen using Syste.out.println.
 * The method must take a two-dimensional array as input, and it must not return anything as output.
 * Use this static method in a class to solve a matrix multiplication problem.
 * Use this static method to output a matrix three times - output the first matrix, output the second matrix, output the result.
 */
public class Runner {
    public static void main(String[] args) {
        int[][] array1 = new int[][] {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] array2 = new int[][]{{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        System.out.println("Array1");
        Util.enterArray(array1);
        System.out.println();
        System.out.println("Array2");
        Util.enterArray(array2);

        System.out.println();
        System.out.println("result *");
        Util.matrixMultiplication(array1,array2);
    }
}
