package com.company.tangxin;

import com.company.shenduyouxian.TreeNode;

public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return  true;
        }
        if(Math.abs(dfs(root.left)-dfs(root.right))<=1){
            return isBalanced(root.left)&&isBalanced(root.right);
        }
        return false;
    }


    public int dfs(TreeNode root){
        if (root == null) return 0;
        int lef = dfs(root.left)+1;
        int right = dfs(root.right)+1;
        return Math.max(lef,right);
    }
}
