package com.company.array;

public class GetWinner {
    public int getWinner(int[] arr, int k) {
        int count = 0;
        int max = 0;
        for(int i=1;i<arr.length;i++){
            if (arr[i-1]>arr[i]) count ++;
            else  count =1;
            arr[i] = Math.max(arr[i-1],arr[i]);
            max = arr[i];
            if (count ==k) break;
        }
        return  max;
    }
}
