package com.codewithdelayne;

import java.util.Arrays;

public class Array {
   //CREATE ARRAY -CREATE
    private String[] cities;
    private int count;

    public Array(int length){
        String [] cities = new String[length];
    }

    //INSERT DATA -UPDATE
    //REMOVE -DELETE
    //INDEX


    public void print(){
        for(int i = 0; i < count; i++) {
            System.out.println(cities[i]);
        }
    }

}