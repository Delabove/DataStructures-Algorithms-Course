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
                System.out.println( currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
                //update
                MAX_VALUE = Math.max(MAX_VALUE, currentSum);

            }
        }
        return MAX_VALUE;

    }

    public static void main(String[] args) {

        int[][] arr = { { 1, 1, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0  },
                { 1, 1, 1, 0, 0, 0  },
                { 0, 0, 0, 0, 0, 0  },
                { 0, 0, 0, 0, 0, 0  },
                { 0, 0, 1, 0, 0, 0  } };

        hourglass(arr);
    }


}


