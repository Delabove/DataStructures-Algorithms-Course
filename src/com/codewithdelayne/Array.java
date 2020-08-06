package com.codewithdelayne;

import java.util.Arrays;

public class Array {

    private String[] cities;
    private int count;

    public Array(int length){
        cities = new String[length];
    }




    public void insert(String city){

        if(cities.length == count){
            String[] newCitiesList = new String[count * 2];

            for(int i = 0; i < count; i++)
                newCitiesList[i] = cities[i];

            cities = newCitiesList;
        }
            cities[count++] = city;
    }


    //REMOVE -DELETE
    public void removeAt(int index){
//       validate boundaries
        if(index < 0 || index > count){
            throw new IllegalArgumentException();
        }

//        fill empty cells by shifting remaining items
        for(int i = index; i < count; i++){
            cities[i] = cities[i + 1];
            count--;
        }
    }



    //INDEX

    public void print(){
        for(int i = 0; i < count; i++) {
            System.out.println(cities[i]);
        }
    }

}