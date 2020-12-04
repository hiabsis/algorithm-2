package com.company.stack;

import java.util.PriorityQueue;

public class GetMidFormStream {
    PriorityQueue<Integer> left = new PriorityQueue<>((o1,o2) -> o2-o1);
    PriorityQueue<Integer> right = new PriorityQueue<>();
    int N;
    public void  insert(int num){
        if (N %2 ==0){
            left.add(num);
            right.add(left.poll());
        }else {
            right.add(num);
            left.add(right.poll());
        }
        N++;
    }
    public float getMidNum(){
        if (N%2==0) return left.peek()+right.peek()/2;
        else return (float)left.peek();
    }

}
