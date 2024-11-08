package org.example;

import java.util.*;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

    }

    public static Stack<Integer> sort(Stack<Integer> stack){
        if(stack.size() == 0){
            return stack;
        }
        int temp = stack.remove(stack.size()-1);
        sort(stack);
        insert(stack,temp);
        return stack;
    }
    public static Stack<Integer> insert(Stack<Integer> stack, int temp){
        if( stack.isEmpty() || stack.get((stack.size()-1)) <= temp{
            stack.add(temp);
            return stack;
        }
    }
}
