package com.company.head;

import java.util.ArrayList;

public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int start=1;int end=2,cur=3;
        while (start<end){
            if (cur == sum){
                ArrayList<Integer> ret = new ArrayList<>();
                for (int i=start;i<=end;i++){
                    ret.add(i);
                }
                res.add(ret);
                cur -= start;
                start++;
                end++;
                cur += end;
            }else  if ( cur <end){
                end++;
                cur+=end;
            }else {
                cur -= start;
                start++;
            }
        }
        return res;
    }
}
