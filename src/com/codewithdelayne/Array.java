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

    public void removeAt(int index){
        if(index < 0 || index > count){
            throw new IllegalArgumentException();
        }
        for(int i = index; i < count; i++){
            cities[i] = cities[i + 1];
            count--;
        }
    }

    //INDEX
    public int findIndex(String city){
        for(int i = 0; i < count; i++){
            if(cities[i] == city){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for(int i = 0; i < count; i++) {
            System.out.println(cities[i]);
        }
    }

}