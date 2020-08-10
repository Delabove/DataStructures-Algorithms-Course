package com.codewithdelayne;

import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {

        int[][] arr = { { 1, 1, 1, 0, 0, 0}, { 1,0,1,0,0,0 } };
        int sumOfSums = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                sumOfSums += arr[i][j];
                System.out.println(sumOfSums);
                System.out.println("" + Arrays.toString(arr[i]) + Arrays.toString(arr[j]) + " ");
            }
        }



    }



}
