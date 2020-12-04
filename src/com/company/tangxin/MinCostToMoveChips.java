package com.company.tangxin;

public class MinCostToMoveChips {
    public int minCostToMoveChips(int[] position) {
      int odd = 0,ent=0;
      int n = position.length;
      if (n %2 == 0 ){
          odd = n/2;
      }else {
          ent = n/2;
      }
      return Math.min(odd,ent);
    }
}
