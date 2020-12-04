package com.company.tangxin;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        int l = s.length();
        int start =0;
        for(int i=0;i<n;i++){
            if(s.charAt(start) == t.charAt(i)) start++;
            if(start == l) break;
        }
        return  l == start ?true:false;
    }

    public static void main(String[] args) {
        String s = "hl";
        String t = "hello";
        int index = -1;
        for (char c : s.toCharArray()){
            System.out.printf(""+t.indexOf(c,index+1));
            index = t.indexOf(c, index+1);
            if (index == -1) break;
        }
    }
}
