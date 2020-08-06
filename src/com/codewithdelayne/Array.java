package com.codewithdelayne;

import java.util.Arrays;

public class Array {
    private int[] numbers;
    private int count;

    public Array(int length) {
        numbers = new int[length];
    }



    public void insert(int number){
        //check array if full
        if(numbers.length == count){
            //create a new array and double size
            int[] newNumberList = new int[count * 2];
            //copy old array into new array
                for(int i = 0; i < count; i++)
                    newNumberList[i] = numbers[i];

                    //        set the array
                    numbers = newNumberList;
        }
            //add new item at the end
            numbers[count++] = number;
    }

    public void remove(int index){
//        validate boundaries
        if(index < 0 || index > count){
            throw new IllegalArgumentException();
        }

        for(int i = index; i < count; i++)
            numbers[i] = numbers[i+1];
            count--;
    }


    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(numbers[i]);
    }

}