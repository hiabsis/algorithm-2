package com.company.head;

import java.util.ArrayList;

public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int[] nums, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int i=0;int j=nums.length-1;
        while (i<j){
            int cur = nums[i]+nums[j];
            if (cur==target){
                res.add(nums[i]);
                res.add(nums[j]);
                return res;
            }else if (cur < target){
                i++;
            }else  {
                j++;
            }
        }
        return res;
    }
}
