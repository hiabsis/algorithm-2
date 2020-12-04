package com.company.stack;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MaxInWindows {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1,o2)->o1-o2);
        if (size<0||size>num.length){
            return res;
        }
        for (int i=0;i<size;i++){
            maxHeap.add(num[i]);
        }
        res.add(maxHeap.peek());
        for (int i=0,j=i+size;j<num.length;i++,j++){
            maxHeap.remove(num[i]);
            maxHeap.add(num[j]);
            res.add(maxHeap.peek());
        }
        return res;

    }
}
