package com.codewithdelayne;

import java.util.Arrays;

public class Array {
    private int[] numbers;
    private int count;

    public Array(int length) {
        numbers = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(numbers[i]);
    }

}