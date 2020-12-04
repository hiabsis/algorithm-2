package com.company.search;

import java.util.Scanner;

public class FindKthLargest {
    public int findKthLargest(int[] nums,int k){
        int left = 0,right=nums.length-1;
        while (true){
            int pivot = partition(nums,left,right);
            if (pivot == k-1) return nums[pivot];
            else if (pivot>k-1) right=pivot-1;
            else left=pivot+1;
        }
    }
    public int partition(int[] nums,int left,int right){
        int pivot = left;
        int l = left+1;
        int r = right;
        while (l<=r){
            while (l<=r&&nums[l]>=nums[pivot]) l++;
            while (l<=r&&nums[r]<=nums[pivot]) r--;
            if (l<=r && nums[l]<nums[pivot]&&nums[r]>nums[pivot]){
                swap(nums,l++,r--);
            }

        }
        swap(nums,pivot,r);
        return  r;
    }
    public  void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i] = scanner.nextInt();
        FindKthLargest find = new FindKthLargest();
        System.out.println(find.findKthLargest(arr,1));
        System.out.println(find.findKthLargest(arr,2));
        System.out.println(find.findKthLargest(arr,3));
        System.out.println(find.findKthLargest(arr,4));
        System.out.println(find.findKthLargest(arr,5));
        System.out.println(find.findKthLargest(arr,6));
    }
}
