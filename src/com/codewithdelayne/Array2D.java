package com.codewithdelayne;

import java.util.Arrays;

public class Array2D {

    public static int hourglass(int[][] arr) {

        //Max Sum


        //update
        //end when length has been reached and max has been found

        //start -current max
        int MAX_VALUE = -63;
        int currentSum = 0;

        //loop through and get sum of each
        for (int i = 0; i <= 3; i++)//ROW
        {
            for (int j = 0; j <= 3; j++) //COLUMN
            {    //calculate sum//
                currentSum = currentSum + arr[i][j];
                System.out.print(arr[i][j] + " ");

                //compare current sum with start max value
                MAX_VALUE = Math.max(MAX_VALUE, currentSum);


            }
        }
        return MAX_VALUE;

    }



    public static void main(String[] args) {

        int[][] arr =
        hourglass(arr);
    }


}


