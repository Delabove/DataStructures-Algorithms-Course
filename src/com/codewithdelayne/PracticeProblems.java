package com.codewithdelayne;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;

public class PracticeProblems {

    private int[] nums;
    private int counter;

    public PracticeProblems(int length) {
        nums = new int[length];

    }

    public void insertNums(int num) {
        if(nums.length == counter) {
            int[] newNums = new int[counter * 2];
            for (int i = 0; i < counter; i++)
                newNums[i] = nums[i];
                nums = newNums;
        }

        nums[counter++] = num;
    }

    public void reverseNums(){
        int[] reversedNumbers = new int[counter];
         for (int i = 0; i < counter; i++)
             reversedNumbers[i] = nums[counter - i -1];
            nums = reversedNumbers;

        for(int i = 0; i< nums.length; i++) {
            System.out.print(" " + nums[i] + " ");

//            for(int i = nums.length-2; i >= 0; i--) {
//                System.out.print(" " + nums[i] + " ");
//            }
        }

    }


    public void printNums() {
        for (int i = 0; i < counter; i++)
            System.out.println(nums[i]);
    }



}
