package com.company.tangxin;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Soulution {
    public int findContentChildren(int[] grid, int[] size) {
        Arrays.sort(grid);
        Arrays.sort(size);
        int g = 0;
        int s = 0;
        while (g<grid.length&&s<size.length){
            if(grid[g]<size[s]){
                g++;
            }
            s++;
        }
        return g;
    }
}
