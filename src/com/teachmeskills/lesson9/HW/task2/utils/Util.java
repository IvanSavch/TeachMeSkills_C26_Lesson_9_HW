package com.teachmeskills.lesson9.HW.task2.utils;

public class Util {
    public static void matrixMultiplication(int[][] array1, int[][] array2 ) {
        int[][] array3 = new int[array1.length][array2[0].length];

        for (int i = 0; i < array3.length; i++) {
            System.out.println();
            for (int j = 0; j < array3[i].length; j++) {
                for (int k = 0; k < array1[0].length; k++) {
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
                System.out.print(array3[i][j] + " ");
            }
        }
    }
    public static void enterArray (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
