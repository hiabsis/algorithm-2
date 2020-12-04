package com.company.shenduyouxian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSubsequence {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums.length;
        }
        List<Integer> res = new ArrayList<>();
        int temp= 0;
        for (int  i= nums.length-1;i>=0;i--){
            temp += nums[i];
            System.out.println("" + temp);
            if (temp*2 > sum){
                res.add(nums[i]);
              break;
            }
            res.add(nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
      if (14>14){

      }
    }
}
