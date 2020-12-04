package com.company.stack;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class GetLeastNumbers {
    public ArrayList<Integer> getlestNUmber(int[] nums,int k){
        if (k<0||k>nums.length) return new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i=0;i<nums.length;i++){
            maxHeap.add(nums[i]);
            if (maxHeap.size()>k)
                maxHeap.poll();
        }
        return new ArrayList<>(maxHeap);
    }

    public static void main(String[] args) {
        GetLeastNumbers getLeastNumbers = new GetLeastNumbers();
        int[] arr = new int[10];
        for (int i=0;i<10;i++){
            arr[i] = i;
        }
        System.out.println(getLeastNumbers.getlestNUmber(arr,3));
    }
}
