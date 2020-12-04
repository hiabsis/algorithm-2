package com.company.tangxin;

import java.util.List;

public class MinTime {
    public  int[]  reverseEdges;
    public boolean[] visit;
    public  int ant = 0;
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        reverseEdges = new int[n];
        for (int[] edge:edges){
            reverseEdges[edge[1]] = edge[0];
        }
        visit[0] =true;
        for (int i=0;i<n;i++){
            if (hasApple.get(i)){
                dfs(i);
            }
        }
        return ant*2;
    }
    public void dfs(int to){
       if (visit[to] != true){
           visit[to] = true;
           ant ++;
           dfs(reverseEdges[to]);
       }
    }
}
