package com.codewithdelayne;

import java.util.Stack;

public class StringReverser {
    public  String reverse(String input){
        Stack<Character> stack = new Stack<>();
        for(char ch : input.toCharArray()) {
            stack.push(ch);
        }
    }
}
