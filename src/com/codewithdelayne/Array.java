package com.codewithdelayne;



public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    //
        public void insert(int item) {
        //if full resize the array
        if (items.length == count) {
            //resize array
            int[] newItem = new int[count * 2];
            //copy old array into new
            for (int i = 0; i < count; i++) {
                newItem[i] = items[i];
                //set
                items = newItem;
//
            }


        }
            //insert new item at the end
            items[count++] = item;
    }

            public void print () {
                for (int i = 0; i < count; i++) {
                    System.out.println(items[i]);
                }
            }




}