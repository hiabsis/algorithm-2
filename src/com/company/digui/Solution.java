package com.company.digui;

import java.util.LinkedList;
import java.util.List;

class Solution {
    List<String> res = new LinkedList<>();
    int l = 0;
    public List<String> letterCombinations(String digits) {
        char[] d = digits.toCharArray();
        l = d.length;

       return  res;
    }
    String  dfs(int p){
        if (p == l) return "";
        dfs(p+1);
        dfs(p+2);
        dfs(p+3);
        return ""+(char) p;
    }



    public static void main(String[] args) {
        System.out.println(""+(int)'a'+" "+(int)'z');
    }

}