package com.company.tangxin;

public class RobotSim {
    public int robotSim(int[] commands, int[][] obstacles) {
        int [] d = new int[4];
        d[0] = 1 ;
        for(int command:commands){

        }
        return 0;
    }
    public int n = 1;
    public int e = 0;
    public int x = 0;
    public int y = 0;
    public void move(int m,int[][] map){
       x = e == 0?x:(e == 1?x+m:x-m);
       y = n == 0?y:(n == 1?y+m:y-m);
    }
    public void change(int command,int[][] map){
        if(command == 1){
            if(n==1){
                n=0;
                e=1;
            }else if(n==-1){
                n=0;
                e=-1;
            }
            if(e==1){
                n=-1;
                e=0;
            }else if(e==-1){
                n=1;
                e=0;
            }
        }else if (command == -1){
            if(n==1||n==-1){
                n=0;
                e=-n;
            }else if(e==1||e==-1){
                e=0;
                n=e;
            }
        }else {
            move(command,map);
        }
    }

}
