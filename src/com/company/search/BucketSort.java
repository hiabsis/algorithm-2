package com.company.search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BucketSort {
    public void bucketSort(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        int num = (max-min)/n+1;
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<>();
        for (int i=0;i<num;i++){
            bucket.add(new ArrayList<>());
        }
        for (int i=0;i<n;i++){
            int index = (arr[i]-min)/n;
            bucket.get(index).add(arr[i]);
        }
        for (int i=0;i<num;i++){
            Collections.sort(bucket.get(i));
        }
        int j = 0;
        for (int i=0;i<num;i++){
            for (int val:bucket.get(i)){
                arr[j++] = val;
            }
        }
        for (int i =0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        BucketSort sort = new BucketSort();
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++) arr[i] = scanner.nextInt();
            sort.bucketSort(arr);
    }
}
