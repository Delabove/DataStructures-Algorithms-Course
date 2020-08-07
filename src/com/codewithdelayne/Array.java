package com.codewithdelayne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


    public int indexOf(int number){
        for(int i = 0; i < count; i++)
            if(numbers[i] == number){
                return i;
            }
        return -1;
    }

  public int max(){
        int max = 0;
        for(int number : numbers)
            if(number > max){
                max = number;
            }
        return max;
  }
  public void reverse(){
        int[] reversedArray = new int[count];
        for(int i = 0; i < count; i++)
            reversedArray[i] = numbers[count - i - 1];
        numbers = reversedArray;
  }

  public Array intersection( Array arr2){
        var intersection = new Array(count);
        for(int number : numbers)
            if(arr2.indexOf(number) >= 0){
                intersection.insert(number);
            }
        return intersection;
  }

 // REVIEW THIS ONE
//    public void insertAt(int number, int index) {
//        if (index < 0 || index > count)
//            throw new IllegalArgumentException();
//
//        // Note that I've extracted the logic for
//        // resizing the array into this private
//        // method so we can reuse in insert() and
//        // insertAt() methods.
//        //
//        // This also made our code cleaner and
//        // more readable.
//        resizeIfRequired();


    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(numbers[i]);
    }

}