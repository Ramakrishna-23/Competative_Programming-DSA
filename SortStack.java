package org.example;

import java.util.*;
// Sort stack using recursion 
public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(6);
        stack.push(9);
        stack.push(8);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(7);

        stack = sort(stack);

        while(!stack.isEmpty()){
            int ele = stack.pop();
            System.out.println(ele);
        }

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
        if( stack.isEmpty() || stack.get((stack.size()-1)) <= temp){
            stack.add(temp);
            return stack;
        }
        int temp1 = stack.pop();
        stack = insert(stack, temp);
        stack.push(temp1);

        return stack;
    }
}
