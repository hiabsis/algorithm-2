package com.company.array;

public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        int[] cnt = new int[128];
        for (char c:str.toCharArray()){
            cnt[c]++;
        }
        for (int i=0;i<128;i++){
            if (cnt[i]==1){
                return i;
            }
        }
        return -1;
    }
}
