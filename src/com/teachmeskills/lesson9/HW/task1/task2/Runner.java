package com.teachmeskills.lesson9.HW.task1.task2;

import com.teachmeskills.lesson9.HW.task1.task2.utils.Util;

import java.util.Arrays;

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
