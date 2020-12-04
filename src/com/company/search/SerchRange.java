package com.company.search;

public class SerchRange {
    public int[] searchRange(int[] nums, int target) {
        int start = -1,end=-1;

        int left =0,right=nums.length-1,mid=left+(right-left)/2;
        while (left != right){
            if (nums[mid] == target){
                int temp = mid;
                while (temp>=0){
                    if (temp!=target){
                        start = temp++;
                        break;
                    }
                    temp--;
                }
                while (mid<nums.length){
                    if (temp!=target){
                        end = temp--;
                        break;
                    }
                    temp++;
                }
            }
        }
        return start!=-1&&end!=-1?new int[]{start,end}:new int[]{-1,-1};
    }
}
