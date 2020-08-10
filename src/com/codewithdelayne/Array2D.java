package com.codewithdelayne;
import java.util.Arrays;

import java.util.Arrays;

public class Array2D {

    public static int hourglass(int[][] arr) {

        //start -current max
        int MAX_VALUE = -63;
        int currentSum = 0;

        //loop through and get sum of each
        for (int i = 0; i <= 3; i++)//ROW
        {
            for (int j = 0; j <= 3; j++) //COLUMN
            {    //calculate sum//
                currentSum = (arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
                //update
                MAX_VALUE = Math.max(MAX_VALUE, currentSum);

            }
        }
        return MAX_VALUE;

    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int numDigits = (int) Math.log10(hourglass(arr)) + 1;
        if (numDigits <= 1) {
            numDigits = 2;
        }
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            int[] row = arr[i];
            for (int j = 0; j < 6; j++) {
                int block = row[j];
                buf.append(String.format("%" + numDigits + "d", block));
                if (j >= row.length - 1) {
                    buf.append("\n");
                }
            }
        }
        System.out.println(buf.toString()); ;
    }


}


