package com.company.tangxin;

import com.company.shenduyouxian.TreeNode;

public class MaxProduct {
    double nodesum =0;
    double allsum = 0;
    double ans = Double.MIN_VALUE;
    public int maxProduct(TreeNode root) {
        allsum = sum(root);
      dfs(root);
        return (int) ans % (int)(1e9 + 7);
    }

    public double sum(TreeNode root){
        if(root == null){
            return  0;
        }
        return root.val+sum(root.left)+sum(root.right);
    }
    public double dfs(TreeNode root){
        if ( root == null){
            return 0;
        }
        nodesum = root.val +dfs(root.left) +dfs(root.right);
        ans = Math.max(ans,(allsum-nodesum)*nodesum);
       return nodesum;
    }

}
