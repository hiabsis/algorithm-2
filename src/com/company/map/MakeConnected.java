package com.company.map;

public class MakeConnected {
    public int makeConnected(int n, int[][] connections) {
        boolean[] visited = new boolean[n];
        int countEde = 0;
        int countNode = 0;
        for (int[] connect :connections){
                if (!visited[connect[0]]&&!visited[connect[1]]){
                    countNode +=2;
                    countEde ++;
                }else if (visited[connect[0]]&&visited[connect[1]]){

                }else {
                    countNode +=1;
                    countEde ++;
                }
        }
        int edg = connections.length-countEde;
        int node = n-countNode;
        return edg<node?-1:edg;
    }
}
