package com.company.tangxin;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int c = 0;
        int d = 0;
        int e = a + b;
        int f = e / 2 +1 ;
        int[] ans = new int[f];
        for(int i=0;i<f;i++){
            if(a==0||c>=a){
                ans[i] = nums2[d];
                d++;
            }else if(b ==0 || d>=b){
                ans[i] = nums1[c];
                c++;
            }else {
                if(nums1[c]>nums2[d]){
                    ans[i] = nums1[d];
                    d++;
                }else {
                    ans[i] = nums2[e];
                    e++;
                }
            }
        }

            return e%2==0?(double) (ans[f]+ans[f-1])/2:(double)ans[f];

    }
}
