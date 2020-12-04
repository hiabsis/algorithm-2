package com.company.stack;

import java.util.Stack;

public class    IsPopOrder {
    public boolean isPopOrder(int[] pushSequence, int[] popSequence) {
        Stack<Integer> stack = new Stack<>();
        for(int pushIndex=0,popIndex=0;pushIndex<pushSequence.length;pushIndex++){
            stack.push(pushSequence[pushIndex]);
            while (popIndex<popSequence.length&&!stack.isEmpty()&&stack.peek()==popSequence[popIndex]){
                stack.pop();
                popIndex++;
            }
            pushIndex++;
        }
        return stack.isEmpty();
    }
}
