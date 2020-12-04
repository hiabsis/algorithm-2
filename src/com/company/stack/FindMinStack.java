package com.company.stack;

import java.util.Stack;

public class FindMinStack {
    Stack<Integer> data = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void  push(int node){
        data.push(node);
        min.push(min.isEmpty()?node:Math.min(node,min.peek()));
    }
    public void pop(){
        data.pop();
        min.pop();
    }
   public int top(){
        return data.peek();
   }
   public int min(){
        return min.peek();
   }

}
