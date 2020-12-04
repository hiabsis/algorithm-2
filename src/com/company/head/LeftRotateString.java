package com.company.head;

public class LeftRotateString {
    public String leftRotateString(String str, int n) {
        char[] chars = str.toCharArray();
        if (n>str.length()){
            return "";
        }
        reverse(chars,0,n-1);
        reverse(chars,n,chars.length-1);
        reverse(chars,0,chars.length-1);
        return new String(chars);
    }
    public void reverse(char[] chars,int i,int j){
        while (i<j){
            char t = chars[i];
            chars[i] = chars[j];
            chars[j] = t;
            i++;
            j++;
        }
    }

}
