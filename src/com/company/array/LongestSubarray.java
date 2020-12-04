package com.company.array;

public class   LongestSubarray {
    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length;
        int cur=0;
        int max = 0;
        if (n <=1) return  0;
        for (int i=0;i<n-1;i++){
           if (Math.abs(nums[i]-nums[i+1]) <= limit){
               cur++;
           }else {
               max = Math.max(cur,max);
               cur=0;
           }
        }
        return cur;
    }
}
