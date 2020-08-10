package com.codewithdelayne;

import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {
        //6x6 2d
        //hourglass: 3x3
            //traverse 3 times
        //hourglass sum: arr[i]+arr[j]
        //worst case: -63
        //Max Sum
            //start -current max
                //loop through and get sum of each
                //compare with start max value
                //update
            //end when length has been reached and max has been found

        int[][] arr = new int[6][6];
        int sumOfSums = 0;
        System.out.println(sumOfSums);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                sumOfSums += arr[i][j];
                System.out.println("" + Arrays.toString(arr[i]) + Arrays.toString(arr[j]) + " ");
            }
        }



    }



}
