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
        if(subjects.length == count){
            String[] newSubjectList = new String[count *2];

            for(int i = 0; i < count; i++)
                newSubjectList[i] = subjects[i];

            subjects = newSubjectList;
        }

         subjects[count++] = subject;
    }

//    Remove values
    public void removeAt(int index){
//        validate boundaries
        if(index < 0 || index > count){
            throw new IllegalArgumentException();
        }
//        find index
        for(int i = index; i < count; i++)
//        shift everything to the left;
            subjects[i] = subjects[i + 1];
            count--;
    }

    public int findIndexOf(String subject){
        for(int i = 0; i < count; i++){
            subjects[i]= subject;
            return i;
        }
        return -1;
    }


    public void print (){
        for(int i = 0; i < count; i++){
            System.out.println(subjects[i]);
        }
    }

//    Index of Values
}