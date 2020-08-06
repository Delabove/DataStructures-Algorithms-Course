package com.codewithdelayne;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }


    public void insert(int item) {
        if (items.length == count) {
//            resize array
            int[] newItems = new int[count * 2];

//            copy old array into new
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
//                set
                items = newItems;
        }

        //insert new item at the end
        items[count++] = item;
    }


    public void removeAt(int index){
        //validate index boundaries
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        //remove index and shift everything over
        for(int i = index; i < count; i++){
            items[i] = items[i + 1];
            count--;
        }
    }

    public  int indexOf(int item) {

        //look for it, if we find, return
        int index = Arrays.binarySearch(items, item);
        return (index < 0) ? -1 : index;
    }



    public void print() {
            for (int i = 0; i < count; i++) {
                System.out.println(items[i]);
            }
        }


}