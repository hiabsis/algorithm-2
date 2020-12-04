package com.company.string;

public class ModifyString {
    public String modifyString(String s) {
        char[] arr = s.toCharArray();
        for (int i=0;i<arr.length;i++){
                if (arr[i] == '?'){
                    char a = 'a';
                    while ((i>0&&arr[i-1] == a)&&(i<arr.length-1&&arr[i+1]==a)) {
                        a++;
                    }
                    arr[i] =  a;
                }
            }

        return new String(arr);
    }

    public static void main(String[] args) {

    }
}
