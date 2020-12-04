package com.company.stack;

import java.util.LinkedList;
import java.util.Queue;

public class FindFirstFormStream {
    Queue<Character> queue = new LinkedList<>();
    int[] cnt = new int[128];
    public void  insert(char ch){
        cnt[ch]++;
        queue.add(ch);
        while (!queue.isEmpty()&&cnt[queue.peek()]>1){
            queue.poll();
        }
    }
    public char firstAppearing(){
        return queue.isEmpty()?'#':queue.peek();
    }

}
