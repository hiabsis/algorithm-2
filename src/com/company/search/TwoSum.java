package com.company.search;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for (int i=0;i<nums.length;i++){
            int val = nums[i];
            int res = target-val;
            if (set.contains(res)&&res != val){
                for (int j=0;j<nums.length;j++){
                    if (nums[j] == res){
                        res = j;
                        break;
                    }
                }
                return new int[]{val,res};
            }
        }
        return  new  int[]{-1,-1};
    }
}
