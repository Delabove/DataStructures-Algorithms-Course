package com.codewithdelayne;

import java.util.Arrays;

public class Array {
   //CREATE ARRAY -CREATE
    private String[] cities;
    private int count;

    public Array(int length){
        cities = new String[length];
    }

//    //INSERT DATA -UPDATE


    public void insert(String city){

//        //RESIZE ARRAY
//        find out if current array is full
        if(cities.length == count){
            //if so, create a new one, and double size
            String[] newCitiesList = new String[count * 2];
            //copy old array into new array
            for(int i = 0; i < count; i++)
                newCitiesList[i] = cities[i];
            //set
            cities = newCitiesList;
        }

//insert new item at end
            cities[count++] = city;
    }


    //REMOVE -DELETE
    //INDEX


    public void print(){
        for(int i = 0; i < count; i++) {
            System.out.println(cities[i]);
        }
    }

}