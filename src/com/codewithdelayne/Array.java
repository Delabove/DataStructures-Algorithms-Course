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
        if(numbers.length == count){
            int[] newNumberList = new int[count * 2];
                for(int i = 0; i < count; i++)
                    newNumberList[i] = numbers[i];
                    numbers = newNumberList;
        }
            numbers[count++] = number;
    }

    public void remove(int index){
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
    public int diff21(int n) {
        if(n > 21){
            return (n - 21) * 2;
        }
        return (21 - n);
    }

    public int sumDouble(int a, int b) {
        if(a == b){
            return (a+b)*2;
        }
        return(a + b);
    }
    public boolean makes10(int a, int b) {
        if(a == 10 || b == 10 || a + b == 10){
            return true;
        }
        return false;
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