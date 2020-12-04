package com.company.tangxin;

import com.company.shenduyouxian.TreeNode;

public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        return dfs(root,sum);
    }
    public  boolean dfs(TreeNode root,int sum){
        if (sum == 0){
            return true;
        }


        return dfs(root.left,sum - root.val)||dfs(root.right,sum-root.val);
    }
}


