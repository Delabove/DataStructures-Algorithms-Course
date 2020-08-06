package com.codewithdelayne;

import java.util.Arrays;

public class Array {
//    Create Array
    private String[] subjects;
    private int count;

    public Array(int length){
        subjects = new String[length];
    }

//    Insert values
    public void insert(String subject){
        //check to see if the array is full
        if(subjects.length == count){
            //resize the array x 2
            String[] newSubjectList = new String[count *2];
            //copy old array into new array
            for(int i = 0; i < count; i++)
                newSubjectList[i] = subjects[i];
            //set new array item
            subjects = newSubjectList;
        }






        //add item to end
         subjects[count++] = subject;
    }



    public void print (){
        for(int i = 0; i < count; i++){
            System.out.println(subjects[i]);
        }
    }
//    Remove values
//    Index of Values
}